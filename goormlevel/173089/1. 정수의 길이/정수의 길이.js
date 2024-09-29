// Run by Node.js
const readline = require('readline');

(async () => {
	let rl = readline.createInterface({ input: process.stdin });
	let data;
	for await (const line of rl) {
		console.log(line.length);
		rl.close();
	}
	process.exit();
})();
