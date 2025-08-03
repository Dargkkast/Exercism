/// <reference path="./global.d.ts" />
// @ts-check

/**
 * Implement the functions needed to solve the exercise here.
 * Do not forget to export them so they are available for the
 * tests. Here an example of the syntax as reminder:
 *
 * export function yourFunction(...) {
 *   ...
 * }
 */
export function cookingStatus(time) {
  return time == null? "You forgot to set the timer." : time == 0? "Lasagna is done." : "Not done, please wait."
}

export function preparationTime(layers, num = 2) {
  return layers.length * num
}

export function quantities(sauces) {
  let noddleLayers = sauces.filter((layer) => layer == "noodles")
  let sauceLayers = sauces.filter((layer) => layer == "sauce")
  
  return {'noodles': noddleLayers.length * 50, 'sauce': sauceLayers.length * 0.2}
}

export function addSecretIngredient(friendsList, myList) {
  myList.push(friendsList.toReversed()[0])
}

export function scaleRecipe(recipe, num) {
  let aux = structuredClone(recipe)
  for (const layer in recipe) {
    aux[layer] = recipe[layer] * num/2
  }

  return aux
}
