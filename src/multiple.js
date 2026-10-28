function getNumberSquare(number) {
    const answer = new Array(number.length);

    for (let count = 0; count < number.length; count++) {
        answer[count] = number[count] * number[count];
    }

    for (let count = 0; count < answer.length; count++) {
        for (let index = 0; index < answer.length; index++) {
            if (answer[count] < answer[index]) {
                let temp = answer[count];
                answer[count] = answer[index];
                answer[index] = temp;
            }
        }
    }

    return answer;
}

module.exports = { getNumberSquare };