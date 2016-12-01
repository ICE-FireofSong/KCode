abstract class Animal {
    sex: string;
    age: number;
    abstract yell(): string;
    constructor(sex: string, age: number) {
        this.sex = sex;
        this.age = age;
    }
}

class AbstractDemo {
    public static main(args: string[]): void {
        var cat = new Cat('girl',16);
        var dog = new Dog('boy',18);
        
        var animals: Array<Animal> = [cat,dog];
        
        var str = "";
        for(var i=0;i<animals.length;i++){
            str += animals[i].yell() + "I'm already "+animals[i].age +", I'm a "+ animals[i].sex;
            str += '------------' 
        }
        
        System.out.println(str);
    }

}

class Cat extends Animal {
    yell(): string {
        return '喵喵！';
    }
}

class Dog extends Animal {
    yell(): string {
        return '旺旺';
    }
}

