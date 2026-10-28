function getShortestWord(sentence) {
    if (sentence === null || sentence === undefined || sentence.trim() === "") {
        return "";
    }

    const words = sentence.trim().split(/\s/);
    let shortest = words[0];

    for (const word of words) {
        if (word.length < shortest.length) {
            shortest = word;
        }
    }

    return shortest;
}

module.exports = { getShortestWord };