const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const [T, ...input] = require('fs').readFileSync(path).toString().trim().split(/\r?\n/).map(Number);
const ouput = [];

const minHeap = {
    heap : [],
    
    insert(val) { 
        this.heap.push(val);
        this.bubbleUp();
    },

    extractMin(){
        if(this.heap.length === 0) return "0";
        if(this.heap.length === 1) return this.heap.pop();

        const min = this.heap[0];
        this.heap[0] = this.heap.pop();
        this.bubbleDown();
        return min;
    },

    bubbleUp(){
        let index = this.heap.length - 1;
        while(index > 0){
            let parentIndex = Math.floor((index - 1) / 2);
            if(this.heap[parentIndex] <= this.heap[index]) break;
            [this.heap[parentIndex], this.heap[index]] = [this.heap[index], this.heap[parentIndex]];
            index = parentIndex;
        }
    },

    bubbleDown() {
        let index = 0;
        const length = this.heap.length;
        const element = this.heap[0];

        while(true){
            let leftChildIndex = 2 * index + 1;
            let rightChildIndex = 2 * index + 2;
            let leftChild, rightChild;
            let swapIndex = null;

            if(leftChildIndex < length){
                leftChild = this.heap[leftChildIndex];
                if(leftChild < element){
                    swapIndex = leftChildIndex;
                }
            }

            if(rightChildIndex < length){
                rightChild = this.heap[rightChildIndex];
                if(
                    (swapIndex === null && rightChild < element) ||
                    (swapIndex !== null && rightChild < leftChild)
                ){
                    swapIndex = rightChildIndex;
                }
            }

            if(swapIndex === null) break;

            [this.heap[index], this.heap[swapIndex]] =  [this.heap[swapIndex], this.heap[index]];
            index = swapIndex;
        }
    }
};

for(let i=0; i<T; i++){
    const x = input[i];
    if(x === 0)
        ouput.push(minHeap.extractMin(x))
    else
        minHeap.insert(x);
}

console.log(ouput.join("\n"));