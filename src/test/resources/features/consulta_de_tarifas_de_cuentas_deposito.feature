# language: es
  @Compra
  Característica: Descarga de archivo de tarifas de cuentas de depositos
    Como usuario de Banistmo
    Deseo ir al menu tarifario
    Para abrir el archivo de las tarifas de cuentas de deposito

    Antecedentes:
      Dado El usuario ingresa al menu Tarifario

  @Exitoso
  Escenario: Descarga del archivo correctamente
    Cuando El usuario abre el documento Tarifas de Cuentas de Depósitos
    Entonces El usuario verifica que el archivo se visualiza correctamente

  @Fallido
  Escenario: Descarga fallida del archivo por inexistencia
    Cuando El usuario abre el documento Inexistente
    Entonces El usuario verifica que el archivo no existe en las opciones
