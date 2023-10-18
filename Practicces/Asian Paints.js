    function applyColor(){
        const walId=document.getElementById('wall-id').value
        const wallColor=document.getElementById('wall-color').value
        const wall=document.getElementById(walId)
        wall.style['background-color']=wallColor
    }
    function resetColor(){
        for (let i=1;i<10;i++){
            const wall=document.getElementById(i)
            wall.style['background-color']='transparent'
        }
    }
