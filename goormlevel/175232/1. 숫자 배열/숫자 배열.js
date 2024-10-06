// Run by Node.js
const readline = require('readline');

(async () => {
	let rl = readline.createInterface({ input: process.stdin });
	let N;
	for await (const line of rl) {
		N = +line;
		rl.close();
	}
	const arr = Array.from({length: N}, (_, i) => 
		Array.from({length: N}, (_, j) => i * N + j + 1)
	);
	arr.forEach(row => {
		console.log(row.join(" "));
	});
	process.exit();
})();
