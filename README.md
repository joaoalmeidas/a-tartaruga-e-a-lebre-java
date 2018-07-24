# a-tartaruga-e-a-lebre-java
Exercicio 7.28 do livro Java: Como Programar

(Simulação: a tartaruga e a lebre) Neste problema, você recriará a clássica corrida da tartaruga e da lebre. Você utilizará geração de
números aleatórios para desenvolver uma simulação desse evento memorável.
Nossos competidores começam a corrida no quadrado 1 de 70 quadrados. Cada um representa uma possível posição ao longo do percurso da competição. A linha de chegada está no quadrado 70. O primeiro competidor a alcançar ou passar o quadrado 70 é recompensado
com um cesto de cenouras frescas e alface. O percurso envolve subir uma montanha escorregadia, por isso, ocasionalmente os competidores
perdem terreno.
Um relógio emite um tique por segundo. A cada tique-taque do relógio, seu aplicativo deve ajustar a posição dos animais de acordo com
as regras na Figura 7.32. Use variáveis para monitorar as posições dos animais (isto é, os números de posição são 1 a 70). Inicie cada animal
na posição 1 (a "largada"). Se um animal escorregar para a esquerda do quadrado 1, mova-o novamente para o quadrado 1.

Tartaruga 

Caminhada rápida  50%     3 quadrados à direita

Escorregão        20%     6 quadrados à esquerda

Caminhada lenta   30%     1 quadrado à direita


Lebre Dormir              20%     Sem nenhum movimento
      Salto grande        20%     9 quadrados à direita
      Escorregão grande   10%     12 quadrados à esquerda
      Salto pequeno       30%     1 quadrado à direita
      Escorregão pequeno 20%     2 quadrados à esquerda

