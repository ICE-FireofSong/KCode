module time{
    export class Clock{
        getTime():string{
            var date = new Date();
            console.log(1);
            return  date.toString();
        }
    }
}