package com.simpletemplepattern;
/*
 * The class contains a method with logic to build a pagoda style temple. This is a try and 
 * gift to respected Navin sir.
 * Made for Ineuron by Abinash K. Chaudhary
 * */
public class SimpleTemplePattern {
	int shift = 0;
	
	public void devArt() {
		int i, j;
		boolean trishul_A, trishul_B, trishul_C, trishul_D, trishul = false;
		boolean damaru_A, damaru_B, damaru_C, damaru_D, damaru_E, damaru_F, damaru = false;
		boolean flag_A, flag_B, flag_C, flag_D, flag_E, flag_F, flag_G, flag_H, flag = false;
		boolean pagoda1_A, pagoda1_B, pagoda1_C, pagoda1_D, pagoda1_E, pagoda1_F, pagoda1_G = false;
		boolean pagoda2_A, pagoda2_B, pagoda2_C, pagoda2_D, pagoda2_E, pagoda2_F, pagoda2_G, pagoda2_H = false;
		boolean pagoda3_A, pagoda3_B, pagoda3_C, pagoda3_D, pagoda3_E, pagoda3_F, pagoda3_G, pagoda3_H, pagoda3_I = false;
		boolean pagoda4_A, pagoda4_B, pagoda4_C, pagoda4_D, pagoda4_E, pagoda4_F, pagoda4_G, pagoda4_H, pagoda4_I, pagoda4_J, pagoda4_K = false;
		boolean pagoda5_A, pagoda5_B, pagoda5_C, pagoda5_D, pagoda5_E, pagoda5_F, pagoda5_G, pagoda5_H, pagoda5_I, pagoda5_J = false;
		boolean pagoda1, pagoda2, pagoda3, pagoda4, pagoda5, pagoda;
		boolean door;
		boolean pillarA, pillarB, pillarC, pillarD, pillar;
		boolean baseA, baseB, baseC, base;
		boolean stairA, stairB, stairC, stair;
		boolean SwastikaA, SwastikaB, SwastikaC, SwastikaD, SwastikaE, SwastikaF, SwastikaG, SwastikaH, SwastikaI, SwastikaJ, SwastikaK, SwastikaL, SwastikaM, SwastikaN, Swastika;
		boolean deep1_A, deep1_B, deep2_A, deep2_B, deep;
		for (i=0; i<139; i++) {
			for (j=0; j<41 + shift;j++) {
				trishul_A = (i >= 0 && i <= 6 && j == 16 + shift);
				trishul_B = (i >= 3 && i <= 80 && j == 20 + shift);
				trishul_C = (i >= 0 && i <= 6 && j == 24 + shift);
				trishul_D = (i == 6 && j >= 16 + shift && j <= 24 + shift);
				trishul = (trishul_A || trishul_B || trishul_C || trishul_D);
				damaru_A = (i >= 9 && i <= 14 && j == 17 + shift);
				damaru_B = (i >= 10 && i <= 13 && j == 18 + shift);
				damaru_C = (i >= 11 && i <= 12 && j == 19 + shift);
				damaru_D = (i >= 11 && i <= 12 && j == 21 + shift);
				damaru_E = (i >= 10 && i <= 13 && j == 22 + shift);
				damaru_F = (i >= 9 && i <= 14 && j == 23 + shift);
				damaru = (damaru_A || damaru_B || damaru_C || damaru_D || damaru_E || damaru_F);
				flag_A = (i >= 16 && i <= 30 && j == 21 + shift);
				flag_B = (i >= 17 && i <= 29 && j == 22 + shift);
				flag_C = (i >= 18 && i <= 28 && j == 23 + shift);
				flag_D = (i >= 19 && i <= 27 && j == 24 + shift);
				flag_E = (i >= 20 && i <= 26 && j == 25 + shift);
				flag_F = (i >= 21 && i <= 25 && j == 26 + shift);
				flag_G = (i >= 22 && i <= 24 && j == 27 + shift);
				flag_H = (i == 23 &&  j == 28 + shift);
				flag = (flag_A || flag_B || flag_C || flag_D || flag_E || flag_F || flag_G || flag_H);
				pagoda1_A = (i == 34 && j >= 19 + shift  && j <= 21 + shift);
				pagoda1_B = (i == 35 && j >= 18 + shift && j <= 22 + shift);
				pagoda1_C = (i == 36 && j >= 17 + shift && j <= 23 + shift);
				pagoda1_D = (i == 37 && j >= 16 + shift && j <= 24 + shift);
				pagoda1_E = (i == 38 && j >= 17 + shift && j <= 23 + shift);
				pagoda1_F = (i == 39 && j >= 18 + shift && j <= 22 + shift);
				pagoda1_G = (i == 40 && j >= 19 + shift && j <= 21 + shift);
				pagoda1 = (pagoda1_A || pagoda1_B || pagoda1_C || pagoda1_D || pagoda1_E || pagoda1_F || pagoda1_G);
				pagoda2_A = (i == 41 && j >= 18  + shift && j <= 22 + shift);
				pagoda2_B = (i == 42 && j >= 17  + shift && j <= 23 + shift);
				pagoda2_C = (i == 43 && j >= 16  + shift && j <= 24 + shift);
				pagoda2_D = (i == 44 && j >= 15  + shift && j <= 25 + shift);
				pagoda2_E = (i == 45 && j >= 16  + shift && j <= 24 + shift);
				pagoda2_F = (i == 46 && j >= 17  + shift && j <= 23 + shift);
				pagoda2_G = (i == 47 && j >= 18  + shift && j <= 22 + shift);
				pagoda2_H = (i == 48 && j >= 19  + shift && j <= 21 + shift);
				pagoda2 = (pagoda2_A || pagoda2_B || pagoda2_C || pagoda2_D || pagoda2_E || pagoda2_F || pagoda2_G || pagoda2_H);
				pagoda3_A = (i == 49 && j >= 18 + shift && j <= 22 + shift);
				pagoda3_B = (i == 50 && j >= 17 + shift && j <= 23 + shift);
				pagoda3_C = (i == 51 && j >= 16 + shift && j <= 24 + shift);
				pagoda3_D = (i == 52 && j >= 15 + shift && j <= 25 + shift);
				pagoda3_E = (i == 53 && j >= 14 + shift && j <= 26 + shift);
				pagoda3_F = (i == 54 && j >= 15 + shift && j <= 25 + shift);
				pagoda3_G = (i == 55 && j >= 16 + shift && j <= 24 + shift);
				pagoda3_H = (i == 56 && j >= 17 + shift && j <= 23 + shift);
				pagoda3_I = (i == 57 && j >= 18 + shift && j <= 22 + shift);				
				pagoda3 = (pagoda3_A || pagoda3_B || pagoda3_C || pagoda3_D || pagoda3_E || pagoda3_F || pagoda3_G || pagoda3_H || pagoda3_I);
				pagoda4_A = (i == 58 && j >= 17 + shift && j <= 23 + shift);
				pagoda4_B = (i == 59 && j >= 16 + shift && j <= 24 + shift);
				pagoda4_C = (i == 60 && j >= 15 + shift && j <= 25 + shift);
				pagoda4_D = (i == 61 && j >= 14 + shift && j <= 26 + shift);
				pagoda4_E = (i == 62 && j >= 13 + shift && j <= 27 + shift);
				pagoda4_F = (i == 63 && j >= 12 + shift && j <= 28 + shift);
				pagoda4_G = (i == 64 && j >= 13 + shift && j <= 27 + shift);
				pagoda4_H = (i == 65 && j >= 14 + shift && j <= 26 + shift);
				pagoda4_I = (i == 66 && j >= 15 + shift && j <= 25 + shift);
				pagoda4_J = (i == 67 && j >= 16 + shift && j <= 24 + shift);
				pagoda4_K = (i == 68 && j >= 17 + shift && j <= 23 + shift);
				pagoda4 = (pagoda4_A || pagoda4_B || pagoda4_C || pagoda4_D || pagoda4_E || pagoda4_F || pagoda4_G || pagoda4_H || pagoda4_I || pagoda4_J || pagoda4_K);
				pagoda5_A = (i == 69 && j >= 17 + shift && j <= 23 + shift);
				pagoda5_B = (i == 70 && j >= 16 + shift && j <= 24 + shift);
				pagoda5_C = (i == 71 && j >= 15 + shift && j <= 25 + shift);
				pagoda5_D = (i == 72 && j >= 14 + shift && j <= 26 + shift);
				pagoda5_E = (i == 73 && j >= 13 + shift && j <= 27 + shift);
				pagoda5_F = (i == 74 && j >= 12 + shift && j <= 28 + shift);
				pagoda5_G = (i == 75 && j >= 11 + shift && j <= 29 + shift);
				pagoda5_H = (i == 76 && j >= 12 + shift && j <= 28 + shift);
				pagoda5_I = (i == 77 && j >= 13 + shift && j <= 27 + shift);
				pagoda5_J = (i == 78 && j >= 13 + shift && j <= 27 + shift);
				pagoda5 = (pagoda5_A || pagoda5_B || pagoda5_C || pagoda5_D || pagoda5_E || pagoda5_F || pagoda5_G || pagoda5_H || pagoda5_I || pagoda5_J);
				pagoda = (pagoda1 == true || pagoda2 == true || pagoda3 == true || pagoda4 == true || pagoda5 == true);
				pillarA = (i >= 77 && i <= 134 && j >= 12 + shift && j <= 13 + shift);
				pillarB = (i >= 77 && i <= 134 && j >= 27 + shift && j <= 28 + shift);
				pillarC = (i >= 113 && i <= 137 && j >= 5 + shift && j <= 6 + shift);
				pillarD = (i >= 113 && i <= 137 && j >= 34 + shift && j <= 35 + shift);
				pillar = (pillarA || pillarB || pillarC || pillarD);
				baseA = (i >= 132 && i <= 134 && j >= 9 + shift && j <= 31 + shift);
				baseB = (i == 131 && j >= 14 + shift && j <= 26 + shift);
				baseC = (i == 138);
				base = (baseA || baseB || baseC);
				door = (i >= 115 && i <= 130 && j >= 18 + shift && j <= 22 + shift);
				stairA = (i == 135 && j >= 16 + shift && j <= 21 + shift);
				stairB = (i == 136 && j >= 14 + shift && j <= 19 + shift);
				stairC = (i == 137 && j >= 12 + shift && j <= 17 + shift);
				stair = stairA || stairB || stairC;
				SwastikaA = (i == 86 && j == 15 + shift);
				SwastikaB = (i >= 87 && i <= 97 + shift && j == 16 + shift);
				SwastikaC = (i == 97 && j >= 16 + shift && j<=24 + shift);
				SwastikaD = (i >= 97 && i <= 106 && j == 24 + shift);
				SwastikaE = (i == 107 && j == 25 + shift);
				SwastikaF = (i == 110 && j == 15 + shift);
				SwastikaG = (i == 109 && j >= 16 + shift && j<=20 + shift);
				SwastikaH = (i >= 85 && i <= 109 && j == 20 + shift);
				SwastikaI = (i == 85 && j >= 20 + shift && j<=24 + shift);
				SwastikaJ = (i == 84 && j == 25 + shift);
				SwastikaK = (i == 91 && j == 18 + shift);
				SwastikaL = (i == 91 && j == 22 + shift);
				SwastikaM = (i == 103 && j == 18 + shift);
				SwastikaN = (i == 103 && j == 22 + shift);
				Swastika = (SwastikaA || SwastikaB || SwastikaC || SwastikaD || SwastikaE || SwastikaF || SwastikaG || SwastikaH || SwastikaI || SwastikaJ || SwastikaK || SwastikaL || SwastikaM || SwastikaN);
				deep1_A = (i >= 111 && i <= 112 && j == 4 + shift);
				deep1_B = (i >= 111 && i <= 112 && j == 7 + shift);
				deep2_A = (i >= 111 && i <= 112 && j == 33 + shift);
				deep2_B = (i >= 111 && i <= 112 && j == 36 + shift);
				deep = (deep1_A || deep1_B || deep2_A || deep2_B);
				if (trishul == true || damaru == true || flag == true || pagoda == true || pillar == true || base == true || stair == true || door == true || Swastika == true || deep == true) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
}