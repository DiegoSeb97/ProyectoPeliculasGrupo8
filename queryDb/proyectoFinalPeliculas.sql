/*proyecto final peliculas*/

create database pelisfin;
use pelisfin;

create table movies(
id int primary key auto_increment not null, 
nombre varchar(100), 
descripcion varchar(1200),
genero varchar(50), 
calificacion int default null, 
anio int default null,
estrellas int, 
director varchar(100));

drop table movies;
select * from movies;

insert into movies values(1, "Top Gun", 
"La trama sigue a Pete Maverick Mitchell, un joven aviador naval a bordo del portaaviones USS Enterprise. Él y su Oficial de Intercepción de Radar, el teniente Nick Goose Bradshaw tienen la oportunidad de entrenar en la Escuela de Armas de Combate de la Marina de los EE. UU. en la Estación Aérea Naval de Miramar en San Diego, California.",
"Accion", 3, 1986, 4, "Tony Scott");
insert into movies values(2, "Alien 3", 
"La única superviviente de una masacre en un planeta lejano, Ripley, huye a Fiorina 161, un planeta olvidado del universo, barrido por fuertes vientos. Allí vive una comunidad compuesta de una veintena de hombres. Violadores, asesinos, infanticidas, son los detenidos por la ley más peligrosos del universo. La llegada de Ripley les enfrentará a un peligro más fuerte que ellos.",
"Terror", 3, 1992, 3, "David Fincher");
insert into movies values(3, "Terminator 2",
"Tras fracasar en el intento de eliminar a Sarah Connor (Linda Hamilton), un nuevo androide mejorado, un T-1000 (Robert Patrick), llega del futuro para eliminar a su hijo, John Connor (Edward Fulong). Será entonces cuando el robot T-800 (Arnold Schwarzenegger) sea enviado para protegerle.",
"Accion", 4, 1991, 5,"James Cameron");
insert into movies values(4, "Godzilla y Kong: El nuevo imperio",
"Tras su último y explosivo enfrentamiento, el todopoderoso Kong y el temible Godzilla, dos de los monstruos que ahora dominan el mundo, se reencuentran para un feroz combate contra una colosal pero desconocida amenaza que se oculta en el planeta. Un enemigo que desafía su propia existencia y, en consecuencia, la de la humanidad protegida por estos titanes. Su historia, sus orígenes y los misterios de la Isla Calavera serán clave para entender la forja de estos extraordinarios seres y su conexión inquebrantable con la humanidad.",
"Accion", 3, 2024, 3, "Adam Wingard");
insert into movies values(5, "Godzilla",
"Protagonizada por Bryan Cranston, ganador del Globo de Oro por Breaking Bad, que da vida a Joe Brody un científico que descubre que algo terrible está a punto de suceder cuando una serie de tsunamis comienzan a llegar a las costas, anticipando la llegada de numerosos monstruos de gran tamaño mientras el ejército intenta defenderse en vano.",
"Accion", 3, 2014, 3, "Gareth Edwards");
insert into movies values(6, "Spiderman",
"Huérfano, Peter Parker fue criado por su tía May y su tío Ben en el barrio de Queens de Nueva York. Mientras estudia en la universidad, encuentra un trabajo de fotógrafo en el periódico Daily Bugle. Comparte su apartamento con Harry Osborn, su mejor amigo, y sueña con seducir a la bella Mary Jane.
Sin embargo, después de que le picara una araña modificada genéticamente, la agilidad y la fuerza de Peter aumentan y descubre poderes sobrenaturales. Convertido en Spiderman, decide utilizar sus nuevas habilidades al servicio del bien.",
"Accion", 4, 2002, 4, "Sam Raimi");
insert into movies values(7, "Proyecto X",
"Thomas (Thomas Mann, 'Una historia casi divertida'), Costa (Oliver Cooper) y JB (Jonathan Daniel Brown) son tres alumnos del último año de instituto que pasan totalmente desapercibidos para todo el mundo. Su misión es salir del anonimato y darse a conocer por todo lo alto. En teoría, su proyecto no deja de ser de lo más inocente e inofensivo: montar una fiesta en casa de Thomas (aprovechando que sus padres están fuera) para dejar huella en todos sus compañeros y grabarlo todo en vídeo. Sin embargo, nunca hubieran imaginado en lo que podría desembocar todo eso... El rumor comienza a propagarse como la espuma hasta que todo el mundo se entera. La convocatoria será un éxito. Las cosas irán más o menos bien hasta que, poco a poco, todo comenzará a descontrolarse cuando se intoxiquen con éxtasis y empiecen a desvariar, llamando la atención de los vecinos y la policía. A pesar de eso, ellos seguirán con la fiesta... sin saber hasta dónde llegarán las consecuencias.",
"Comedia", 3, 2012, 3, "Nima Nourizadeh");
insert into movies values(8, "The naked gun",
"El incompetente y patoso teniente Frank Drebin (Leslie Nielsen) quiere vengar la muerte de su compañero Nordberg, que fue asesinado por unos narcotraficantes durante un tiroteo. Su principal objetivo es encontrar al jefe de la organización y hacerle pagar por lo que hizo. El nefasto, aunque decidido agente, sospecha que al frente de la compañía se encuentra un empresario naviero llamado Vincent Ludwig, pero no dispone de ninguna prueba que motive el arresto. Ante la oposición de la alcaldesa, Drebin se verá obligado a utilizar su (escaso) intelecto para dar con el criminal. En su búsqueda, encontrará el apoyo de Jane Spencer, la exnovia de Ludwig, que también quiere ver al delincuente entre rejas.",
"Comedia", 3, 1989, 3, "David Zucker");
insert into movies values(9, "HellRaiser",
"Frank Cotton (Sean Chapman), un hombre joven y ambicioso, adquiere una misteriosa caja negra que procede de un bazar oriental. La caja no es lo que parece ya que, una vez a solas en casa, Frank descubre que ésta tiene poderes mágicos y que permite la entrada a unas extrañas criaturas llamadas cenobitas procedentes de otra dimensión. Éstas son mucho más terribles y violentas de lo que imaginaba y finalmente acabarán con la vida de Frank y volverán a su mundo llevándose consigo la caja negra.
Veinte años después, Larry Cotton (Andrew Robinson) acompañado por su esposa Julia (Clare Higgins) y su hija, Kirsty (Ashley Laurence), se muda a esta vieja casa. Allí descubren a una horrible criatura escondida en lo más alto de la casa, que resulta ser Frank, el hermano de Larry y también ex-amante de Julia. Después de haber perdido cuerpo atacado por los cenobitas, Frank podrá volver a su antigua forma gracias a la sangre. Julia le proporcionará esta sangre sin que nadie se entere, para que Frank logre completar su cuerpo de nuevo, pero los cenobitas no estarán nada contentos con esta decisión…",
"Terror", 4, 1987, 3, "Clive Barker");
insert into movies values(10, "HellRaiser Remake",
"Una versión del clásico de terror de Clive Barker de 1987 en la que una joven que lucha contra la adicción se hace con una antigua caja de rompecabezas, sin saber que su propósito es invocar a los cenobitas.",
"Terror", 2, 2022, 2, "David Bruckner");
insert into movies values(11, "Scary Movie",
"Una noche, Drew Becker recibe una llamada anónima de un maníaco. Acorralada en su casa y después en su jardín, finalmente es asesinada. Su muerte sume a sus compañeros de instituto en una pesadilla, especialmente porque ahora tendrán que enfrentarse a un asesino en serie que se oculta entre ellos.",
"Comedia", 2, 2000, 2, "Keenen Ivory Wayans");
insert into movies values(12, "La odisea de los giles",
"Argentina, finales del año 2001, una grave crisis económica desemboca en el 'corralito' bancario en todo el país. En un pequeño pueblo de la provincia de Buenos Aires, un grupo de vecinos sufre con indignación la estafa llevada a cabo por un abogado y gerente de banco, que les ha hecho perder el dinero que habían ahorrado para reflotar una cooperativa agrícola. Con tal de recuperar sus ahorros, este grupo de vecinos decide organizarse y armar un minucioso plan con el objetivo de recuperar su dinero. Será la revancha de un grupo de 'perdedores' que quieren recuperar lo que les pertenece.",
"Aventura", 3, 2019, 4, "Sebastian Borensztein");
insert into movies values(13, "El secreto de sus ojos",
"Benjamin Espósito (Ricardo Darín) se ha retirado recientemente de su cargo en el Juzgado de lo Penal. Con bastante tiempo libre, ahora se dedica a escribir un libro. Benjamin utiliza su experiencia para contar una historia trágica que ocurrió en 1974.
En aquella época el Departamento de Justicia para el que trabajaba, fue designado para investigar la violación y posterior asesinato de una joven. Gracias a ello, Benjamin puede ponerse en contacto con Ricardo Morales (Pablo Rago), marido de la fallecida y a quien promete ayudar a encontrar al culpable. Para su labor de investigación, cuenta con la ayuda de su gran amigo, Pablo Sandoval (Guillermo Francella), y de su jefa, Irene Menéndez Hastings (Soledad Villamil). Benjamin acaba más involucrado de lo que creía en el relato.",
"Drama", 4, 2009, 5, "Juan Jose Campanela");
insert into movies values(14, "Señales",
"Bucks County, Pennsylvania. Tras perder a su esposa, Graham Hess (Mel Gibson, ¿En qué piensan las mujeres?) abandona su oficio de pastor protestante. Ahora dedicado totalmente a su granja, intenta criar como mejor puede a sus dos hijos, Morgan (Rory Culkin, Historia de un secuestro) y Bo (Abigail Breslin, Pequeña Miss Sunshine). Su hermano menor, Merrill (Joaquin Phoenix, Gladiator), una antigua gloria del béisbol, está viviendo con ellos para ayudarles. Una mañana, la familia descubre la aparición en sus campos de gigantescas marcas y extraños círculos. ¿Serán los extraterrestres los causantes de estos fenómenos sobrenaturales? Graham y Merrill tratarán de desentrañar el misterio que rodea tales dibujos.",
"Suspenso", 3, 2001, 3, "Manoj Nelliyattu Shyamalan");
insert into movies values(15, "Nueve Reinas",
"La historia sigue a Juan y a Marcos (Ricardo Darín y Gaston Pauls), dos estafadores residentes en Buenos Aires. La acción transcurre en tan solo veinticuatro horas. En ese tiempo los protagonistas se conocen y se involucran en un negocio que les puede hacer ganar una cuantiosa suma de dinero. La misión consiste en robar unos sellos falsos conocidos como las nueve reinas para que un millonario y empresario las tenga en su colección. Los protagonistas, que disponen de solo un día para llevar a cabo el robo, deberán utilizar su ingenio para hacerse con el esperado botín.",
"Suspenso", 4, 2000, 4, "Fabian Bielinsky");