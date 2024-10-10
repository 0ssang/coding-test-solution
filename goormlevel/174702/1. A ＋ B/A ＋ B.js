// Run by Node.js
const readline = require('readline');

(async () => {
	let rl = readline.createInterface({ input: process.stdin });
	let input;
	for await (const line of rl) {
		input = line;
		rl.close();
	}
	
	let [a, b] = input.split(" ").map(Number);
	console.log(a+b);
	process.exit();
})();
