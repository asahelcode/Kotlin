abstract class Animal {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    open var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    open fun roam() {
        println("Animal is roaming")
    }

    fun sleep() {
        println("Animal is sleeping")
    }
}

abstract class Feline: Animal() {
    override fun roam() {
        println("Feline is roaming")
    }
}

abstract class Canine: Animal() {
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
    override val food = "meat"
    override val habitat = "forest"
    override val image = "lion.png"

    override fun makeNoise() {
        println("Roar!!!!")
    }

    override fun eat(){
        println("Lion is eating a full cow")
    }
}

class Cheetah: Feline() {
    override val food = "meat"
    override val habitat = "forest"
    override val image = "cheetah.png"

    override fun makeNoise() {
        println("EEEEEyyyyen!!!!")
    }

    override fun eat(){
        println("Cheetah is eating a full cow")
    }
}

class Lynx: Feline() {
    override val food = "meat"
    override val habitat = "forest"
    override val image = "lynx.png"

    override fun makeNoise() {
        println("Lyyyyynnnnnnnnnnnnnn!!!!")
    }

    override fun eat(){
        println("Lynx is eating a full cow")
    }
}

class Fox: Canine() {
    override val food = "meat"
    override val habitat = "forest"
    override val image = "fox.png"

    override fun makeNoise() {
        println("Yaaaaaaaaaaaaaaaaahhhhhhh!!!!")
    }

    override fun eat(){
        println("Fox is eating a full cow")
    }
}

class Wolf: Canine() {
    override val food = "meat"
    override val habitat = "forest"
    override val image = "wolf.png"

    override fun makeNoise() {
        println("Huuuuuuuuuuuuuuuuaaaaaaaaah!!!!")
    }

    override fun eat(){
        println("Wolf is eating a full cow")
    }
}

fun main() {

}