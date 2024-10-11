// Run by Node.js
const readline = require('readline');

(async () => {
	let rl = readline.createInterface({ input: process.stdin });
	let input;
	for await (const line of rl) {
		input = line;
		rl.close();
	}
	let [x, y] = input.split(" ").map(Number);
	
	console.log(`${(x+y).toFixed(6)}`);
	process.exit();
})();
