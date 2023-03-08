function required()
{
    var empt = document.formularz.firstName.value;
    if (empt === "")
    {
        alert("Please input a Value");
        return false;
    }
    else
    {
       // alert('Sukces: Student dodany!');
        return true;
    }
}