fun main(args: Array<String>) {
    //Continue & Break Label
    println("Example of Break and Continue Label")
    myLabel@ for(x in 1..10){ // appling the cutom label
        if(x == 5){
            println("I am inside if block with value "+x+" \n-- hence it will close the operation")
            break@myLabel //specifing the label
        }else{
            println("I am inside else block wiyh the value "+x)
            continue@myLabel
        }
        println("Not Print")
    }
}