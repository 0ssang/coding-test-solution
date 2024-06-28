function solution(my_string) {
    return [...my_string].map(c => (c > "Z") ? c.toUpperCase() : c.toLowerCase()).join("");
}