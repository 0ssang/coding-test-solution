const input = require("fs").readFileSync("dev/stdin").toString().trim();
const angle = input.split("\n").map((item) => Number(item));
const sumOfAngle = angle[0] + angle[1] + angle[2];
const set_angle = new Set(angle);

if (sumOfAngle !== 180) console.log("Error");
else if (angle[0] === 60 && angle[1] === 60 && angle[2] === 60)
  console.log("Equilateral");
else if (angle[0] != angle[1] && angle[0] != angle[2] && angle[1] != angle[2])
  console.log("Scalene");
else if (set_angle.size === 2) console.log("Isosceles");