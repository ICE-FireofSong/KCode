module time{
    export class Clock{
        getTime():string{
            var date = new Date();
            return  date.toString();
        }
    }
}