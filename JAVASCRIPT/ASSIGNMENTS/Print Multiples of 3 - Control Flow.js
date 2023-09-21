/*Complete the given printMultiplesOfThree function. You will be given two arguments beginNum, and endNum. 
Your task is to loop from beginNum to endNum, and if a number is a multiple of 3, 
print that number to the console.*/

function printMultiplesOfThree(beginNum, endNum) {
    for (let i=beginNum;i<=endNum;i++){
        if (i%3==0){
            console.log(i);
        }
    }
}