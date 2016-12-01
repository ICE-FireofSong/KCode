module System{
    export class out{
        static println(str){
            document.getElementById('msg').innerText = str;
        }
    }
}

window.onload =()=>{
    AbstractDemo.main(null);
}