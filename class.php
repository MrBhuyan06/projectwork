<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
     class Student{
         public $name;
         public $email;
         public $phone;
         function set_name($name){
             $this->name=$name;
         }
         function get_name(){
             return $this->name;
         }
         function set_email($email){
            $this->email=$email;
        }
        function get_email(){
            return $this->email;
        }
        function set_phone($phone){
             $this->phone=$phone;
        }
        function get_phone(){
            return $this->phone;
        }
     }


$obj= new Student();
$obj->set_name($_POST["name"]);
echo "Name".$obj->get_name();

$obj->set_email($_POST["email"]);
echo "Email".$obj->get_email();
$obj->set_phone($_POST["phone"]);
echo "phone".$obj->get_phone();



?>

</body>
</html>