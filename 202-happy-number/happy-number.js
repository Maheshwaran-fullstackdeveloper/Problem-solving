/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    let seen = new Set();

    while (n !== 1 && !seen.has(n)) {
        seen.add(n);
        let sum = 0;
        let arr = n.toString().split('');
        
        for (let i = 0; i < arr.length; i++) {
            sum += Math.pow(Number(arr[i]), 2);
        }

        n = sum;
    }
    return n === 1;
};
