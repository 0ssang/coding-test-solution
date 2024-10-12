// Run by Node.js
const readline = require('readline');

(async () => {
	let rl = readline.createInterface({ input: process.stdin });
	for await (const line of rl) {
		let input = Number(line);
		let arr = new Array(input+1).fill(0);
		arr[1] = 0;
		arr[2] = 1;
		for(let i=3; i<=input; i++){
			arr[i] = (arr[i-1] + arr[i-2]) % 1000000007;
		}
		console.log(arr[input]);
		rl.close();
	}
	
	process.exit();
})();
