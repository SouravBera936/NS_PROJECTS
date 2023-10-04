function calcTotal() {
 const priceNodes=fetchPriceNodes()
 const totalCost=sumOfAllPriceNoes(priceNodes)
 if(!checkGrandTotalExist()){
    const grandtotalRow=appendGrandTotalRow(totalCost)
    appendgrandTotalRowToTable(grandtotalRow)
 }else{
    updategrandToatlRow(totalCost)
 }
}
function fetchPriceNodes(){
    const selector='[data-ns-test="price"]'
    const Nodes=document.querySelectorAll(selector)
    return Nodes
}
function sumOfAllPriceNoes(Nodes){
    let totalPrice=0
    for (const priceText of Nodes){
        totalPrice+=Number(priceText.innerText)
    }
    return totalPrice
}
function appendGrandTotalRow(totalPrice){
    const row=document.createElement('tr')
    const column1=document.createElement('td')
    const column2=document.createElement('td')
    column1.innerText='Grand Total'
    column2.innerText=totalPrice
    column2.setAttribute('data-ns-test','grandTotal')
    row.appendChild(column1)
    row.appendChild(column2)
    return row
}
function appendgrandTotalRowToTable(grandtotalrow){
    const tbodyNode=document.getElementsByTagName('tbody')[0]
    tbodyNode.appendChild(grandtotalrow)
}
function checkGrandTotalExist(){
    const selector='[data-ns-test="grandTotal"]'
    const grandTotalNode=document.querySelector(selector)
    return grandTotalNode !== null
}
function updategrandToatlRow(totalPrice){
    const selector='[data-ns-test="grandTotal"]'
    const grandTotalNode=document.querySelector(selector)
    grandTotalNode.innerText=totalPrice
}