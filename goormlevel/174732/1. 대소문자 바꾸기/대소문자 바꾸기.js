// Run by Node.js
const readline = require('readline');

(async () => {
	let rl = readline.createInterface({ input: process.stdin });
	let input = [];
	for await (const line of rl) {
		input.push(line);
	}
	
	let s = input[1].split("").map((c) => {
		if(c === c.toUpperCase()) return c.toLowerCase();
		else return c.toUpperCase();
	})
	
	console.log(s.join(""));
	process.exit();
})();
