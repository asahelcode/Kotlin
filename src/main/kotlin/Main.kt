open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    open var hunger = 10

    open fun makeNoise() {
        println("Animal is making a noise")
    }

    open fun eat() {
        println("Animal is eating")
    }

    open fun roam() {
        println("Animal is roaming")
    }

    open fun sleep() {
        println("Animal is sleeping")
    }
}

class Feline: Animal() {
    override fun roam() {
        println("Feline is roaming")
    }
}

class Canine: Animal() {
    override fun roam() {
        println("Canine is roaming")
    }
}

class Hippo: Animal() {
    override val image = "image.png"
    override val food = "grass"
    override val habitat = "river"

    override fun makeNoise() {
        println("Grunt! Grunt!! Grunt!!!")
    }

    override fun eat() {
        println("Hippo is eating")
    }
}

class Lion: Feline() {
    override val
}

class Cheetah: Feline(){

}