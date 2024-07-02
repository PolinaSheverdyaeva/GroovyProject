package in.at.stringsdemo

class StringsDemo {

    static main(args) {

        //Java strings and applicable to Groovy also
        String strLiteral = "String"
        println strLiteral

        String str = new String("mouse") // very rarely used
        println str

        //Groovy Strings

        //Single Quote

        def singleQuoteString = '${str} This is a ' +
                'single quote ' +
                'string' + 'a'

        println(singleQuoteString)

        //Triple Single Quote

        def tripleSingleQuoteString = '''\
This is a triple single ${str} 
        quote string''' + '''a'''
        println("Triple Single quote: " + tripleSingleQuoteString)

        // Double Quote

        def sampleData = "Groovy"

        def doubleQuote = "This is a ${str} and ${sampleData} and \$100"
        println(doubleQuote)

        //Triple Double Quote

        def tripleDoubleQuote = """\
This is triple double ${sampleData}
quote ${str}"""
        println tripleDoubleQuote

        // Slashy string

        def slashyString = /This is a Slashy String
        This is a new line
        ${str}/
        println slashyString


        // Dollar Slashy Quote String

        def dollarSlashyString = $/This is a dollar slashy string/
        This is a new line/
        ${sampleData}/$
        println(dollarSlashyString)

    }
}
