@main def main(name : String): Unit = {
    importCpg(name)
    val x2 = (name, "92_set_to_array_iall",cpg.assignment.code(".*=.*\\[\\.\\.\\..*\\]").location.toJson);
    println(x2)
    delete;
} 


 
