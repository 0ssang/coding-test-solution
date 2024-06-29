function solution(cipher, code) {
    return [...cipher].filter((char, idx) => (idx+1) % code === 0).join("");
}