const fs = require("fs");

const sendImage = (client, image) =>
  new Promise((resolve, reject) => {
    const stream = client.SendImage((error, response) => {
      if (error) {
        reject(error);
      } else {
        resolve(response.message);
      }
    });

    stream.write({
      metadata: {
        name: image.match(/([^\/]+)(?=\.\w+$)/)[0],
        type: image.match(/\.[0-9a-z]+$/i)[0].replace('.',''),
      },
    });

    const imageStream = fs.createReadStream(image);

    imageStream.on("data", (chunk) => {
      stream.write({ file: { data: chunk } });
    });

    imageStream.on("end", () => {
      stream.end();
    });
  });

const showRanking = (client) => {
  const stream = client.ShowRanking();
  stream.on("data", (data) => console.log(data));
  stream.on("error", (error) => console.error(`Blad serwera: ${error}`));
};

const addToRanking = (client, ranking) => {
  if (!Array.isArray(ranking)) {
    ranking = [ranking];
  }
  return new Promise((resolve, reject) => {
    const stream = client.AddToRanking((error, response) => {
      if (error) {
        reject(error);
      } else {
        resolve(response.message);
      }
    });
    ranking.forEach((record) => {
      stream.write({ name: record.name, score: record.score });
    });
    stream.end();
  });
};

const findInRanking = (client, value) =>
  new Promise((resolve, reject) =>
    client.FindInRanking({ score: value }, (err, response) => {
      if (err) {
        return reject(err);
      }
      resolve(response);
    })
  );

module.exports = {
  showRanking,
  findInRanking,
  addToRanking,
  sendImage,
};
