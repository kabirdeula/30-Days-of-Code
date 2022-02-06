'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}



function main() {
    var n = parseInt(readLine());
    var a = readLine().split(' ');
    a = a.map(Number);

    var swapped;
    var numSwaps = 0;
    do{
        swapped = false;
        for(var i = 0; i < n - 1; i++){
            if(a[i] > a[i + 1]){
                var temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                swapped = true;
                numSwaps++
            }
        }
    }while(swapped);
    console.log('Array is sorted in ' + numSwaps + ' swaps.');
    console.log('First Element:',a[0]); 
    console.log('Last Element:',a[n - 1]);
}
