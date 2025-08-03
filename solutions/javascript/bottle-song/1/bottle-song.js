//
// This is only a SKELETON file for the 'Bottle Song' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const recite = (initialBottlesCount, takeDownCount) => {
  let message = []
  let count = takeDownCount
  for (let i = initialBottlesCount; i > initialBottlesCount - takeDownCount; i--) {
    message.push(...songTemplate(i))

    if (count > 1) {
      message.push("")
      count--
    } 
  }
  return message
};

function songTemplate(num) {
  let numbers = ["ERROR", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"]
  
  return [`${numbers[num]} green ${num > 1? 'bottles':'bottle'} hanging on the wall,`,
          `${numbers[num]} green ${num > 1? 'bottles':'bottle'} hanging on the wall,`,
    `And if one green bottle should accidentally fall,`,
    `There'll be ${num > 1? numbers[num-1].toLowerCase(): 'no'} green ${num-1 > 1 || num == 1? 'bottles':'bottle'} hanging on the wall.`]
}