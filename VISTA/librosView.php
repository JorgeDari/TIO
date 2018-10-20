<?php

  require_once "libs/Smarty.class.php";

 class librosView {

   private $basehref;

   public function __construct()
   {
           $this->basehref = '//'.$_SERVER['SERVER_NAME'].dirname($_SERVER['PHP_SELF']).'/';
   }

  
    public function mostrarLibros($libros)
    {
      // Creamos una instancia de la clase smarty
      $smarty = new Smarty();
      $smarty->assign('libros',$libros);
      // Renderizamos el archivo
      $smarty->display('templates/ejemplo.tpl');
    }


      public function mostrar_un_Libro($libro)
      {
        $smarty = new Smarty();
        $smarty->assign('libro',$libro);
        $smarty->display('templates/tabularDatos.tpl');
     }

}
