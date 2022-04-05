const PROTO_PATH = __dirname + "/../grpc-interface/src/main/proto/grpc.proto";

const parseArgs = require("minimist");
const grpc = require("@grpc/grpc-js");
const protoLoader = require("@grpc/proto-loader");
const {
  showRanking,
  findInRanking,
  addToRanking,
  sendImage,
} = require("./methods");
const packageDefinition = protoLoader.loadSync(PROTO_PATH, {
  keepCase: true,
  longs: String,
  enums: String,
  defaults: true,
  oneofs: true,
});

const loadedProto =
  grpc.loadPackageDefinition(packageDefinition).pl.edu.pwr.rsi.grpc.interface;

function getClient() {
  const argv = parseArgs(process.argv.slice(2), {
    string: "target",
  });
  let target;
  if (argv.target) {
    target = argv.target;
  } else {
    target = "localhost:9090";
  }
  return new loadedProto.MyService(target, grpc.credentials.createInsecure());
}

const main = async () => {
  const client = getClient();

  const newRecords = [
    {
      name: "Janek",
      score: 1000,
    },
    { name: "Kuba", score: 150 },
  ];

  console.log(await sendImage(client, "./images/sample.jpg"));
  console.log(await addToRanking(client, newRecords));

  console.log("Rozpoczęto metodę asynchroniczną");
  findInRanking(client, 100).then((data) =>
    console.log("Zakończono metodę asynchroniczną:", data)
  );

  showRanking(client);
};

main();
