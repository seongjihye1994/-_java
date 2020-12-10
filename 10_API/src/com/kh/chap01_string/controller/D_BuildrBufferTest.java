package com.kh.chap01_string.controller;

public class D_BuildrBufferTest {
	
	// String 適掘什 -> 災痕
	// 域紗 葵聖 痕井馬澗 井酔 亜搾走 鎮刑斗亜 域紗 凧繕 鞠走 省澗 庚切伸聖 走趨醤 馬澗 舘繊
	// -> 痕井戚 旋壱 石嬢神奄幻 馬澗 井酔 String適掘什 遂戚
	
	// StringBuffer, StringBuilder -> 亜痕(痕馬澗) 適掘什
	// - 痕井引 煽舌聖 是廃 五乞軒 因娃(獄遁)研 鎧採拭 走蟹澗汽 坦製拭澗 16鯵税 庚切研
	//   走舛拝 呪 赤澗 獄遁亜 持失 鞠壱 庚切亜 煽舌 喫拭 魚虞 切疑生稽 装亜
	// - 段奄 獄遁 滴奄研 走舛拝 呪 赤壱 庚切伸税 掩戚左陥 16鯵税 庚切研 希 煽舌拝 呪 赤製
	
	public void method1() {
		// StringBuffer, StringBuilder 砧 鯵 乞砧 持失切/五社球 疑析
		// 馬走幻 託戚繊精 疑奄鉢 坦軒亜 鞠汗劃 照鞠汗劃税 託戚
		
		// StringBuffer澗 疑奄鉢 坦軒 O (Thread safe)
		// StringBuilder澗 疑奄鉢 坦軒 X
		
		// Thread : 覗稽益轡 叔楳 斐硯聖 馬蟹亜 焼観 砧 室亜走稽 佐慶拝 呪 赤製
		
		// 聡, 菰銅 什傾球劃 舘析 什傾球劃税 託戚
		// 菰銅 什傾球 発井 -> 疑奄鉢 坦軒亜 鞠嬢醤 照穿敗 -> StringBuffer 紫遂 映舌
		// 舘析 什傾球 発井 -> 疑奄鉢 坦軒研 馬檎 紗亀 煽馬 降持 -> StringBuilder 紫遂 映舌
		
		// 酔軒澗 StringBuilder稽幻 拙穣 StringBuffer稽 梓端幻 痕井馬檎 疑析馬惟 五社球 紫遂 亜管
		
		// 1) 奄沙 持失切稽 持失馬惟 鞠檎 奄沙生稽 16 滴奄幻鏑 持失
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1 呪遂勲 : " + sb1.capacity()); // 16 (置企 呪遂拝 呪 赤澗 遂勲 : 巨虹闘 16鯵)
		System.out.println("sb1 掩戚 : " + sb1.length()); // 0鯵 (薄仙 級嬢赤澗 昔畿什 鯵呪)
		System.out.println("==========================");
		
		// 2) 古鯵痕呪 持失切稽 昔呪研 穿含馬檎 背雁 滴奄幻鏑税 呪遂勲戚 走舛 喫
		StringBuilder sb2 = new StringBuilder(30);
		System.out.println("sb2 呪遂勲 : " + sb2.capacity()); // 遂勲聖 30生稽 背操
		System.out.println("sb2 掩戚 : " + sb2.length()); 
		System.out.println("==========================");
		
		// 3) 古鯵痕呪 持失切稽 昔呪研 庚切稽亀 穿含 亜管 (背雁 庚切伸税 昔畿什 掩戚 + 16幻鏑税 呪遂勲 拝雁)
		StringBuilder sb3 = new StringBuilder("鋼亜趨!!");
		System.out.println("sb3 呪遂勲 : " + sb3.capacity()); // 5 + 16 = 21
		System.out.println("sb3 掩戚 : " + sb3.length()); // 5
		System.out.println("==========================");
				
	}
	
	public void method2() {
		// 災痕 vs 亜痕 砺什闘
		
		// String
		String str = "鋼亜趨!";
		System.out.println(System.identityHashCode(str)); // 叔薦 爽社葵 鋼発
		
		str += "貝 String戚鞘";
		System.out.println(System.identityHashCode(str)); // 叔薦 爽社葵 鋼発
		// 災痕 -> 歯稽 持失 鞠檎辞 凧繕馬壱 赤澗 爽社 葵戚 郊餓澗 莫殿
		// 廃腰 走舛鞠檎 益 切軒拭 葵戚 郊餓走 省壱(災痕) 歯稽 持失敗
		
		System.out.println("===================");
		
		// StringBuilder
		StringBuilder sb = new StringBuilder("鋼亜趨!");
		
		System.out.println("sb : " + sb.toString());
		System.out.println("爽社葵 : " + System.identityHashCode(sb));
		System.out.println("呪遂勲 : " + sb.capacity());
		System.out.println("掩戚 : " + sb.length());
		System.out.println("===================");
//		sb : 鋼亜趨!
//		爽社葵 : 2018699554
//		呪遂勲 : 20
//		掩戚 : 4
		
		// StringBuilder拭辞 葵聖 痕井馬壱切 拝 凶澗 五社球研 搭背辞 拙穣
		// 1. append(String str) : StringBuilder -> 庚切伸 蓄亜
		sb.append("照括!");
		System.out.println("痕井 板 sb : " + sb.toString());
		System.out.println("爽社葵 : " + System.identityHashCode(sb));
		System.out.println("呪遂勲 : " + sb.capacity());
		System.out.println("掩戚 : " + sb.length());
		System.out.println("===================");
//		痕井 板 sb : 鋼亜趨!照括!
//		爽社葵 : 2018699554   --->> 梓端税 爽社葵戚 郊餓走 省製!(葵戚 亜痕)
//		呪遂勲 : 20
//		掩戚 : 7
		
		// 聡, 葵戚 痕井鞠檎 益 切軒拭 郊稽 葵戚 郊会(亜痕), 歯 梓端 持失 x
		
		sb.append("陥級 繕榎幻 毘鎧室推!!!");
		System.out.println("痕井 板 sb : " + sb.toString());
		System.out.println("爽社葵 : " + System.identityHashCode(sb));
		System.out.println("呪遂勲 : " + sb.capacity());
		System.out.println("掩戚 : " + sb.length());
		System.out.println("===================");
//		痕井 板 sb : 鋼亜趨!照括!陥級 繕榎幻 毘鎧室推!!!
//		爽社葵 : 2018699554
//		呪遂勲 : 42
//		掩戚 : 21
		
		// 2. delete(int start, int end) : StringBuilder -> 庚切伸 肢薦
		sb.delete(2, 5);
		System.out.println("痕井 板 sb : " + sb.toString());
		System.out.println("爽社葵 : " + System.identityHashCode(sb));
		System.out.println("呪遂勲 : " + sb.capacity());
		System.out.println("掩戚 : " + sb.length());
		System.out.println("===================");
		// 2, 3, 4 昔畿什拭 背雁馬澗 庚切 肢薦 喫 (end -1猿走 肢薦)
//		痕井 板 sb : 鋼亜括!陥級 繕榎幻 毘鎧室推!!!
//		爽社葵 : 2018699554
//		呪遂勲 : 42
//		掩戚 : 18
		
		// 3. insert(int offset, String str) : StringBuilder
		sb.insert(1, "ぞぞぞ"); // 1腰 昔畿什拭 ぞぞぞ 隔製
		System.out.println("痕井 板 sb : " + sb.toString());
		System.out.println("爽社葵 : " + System.identityHashCode(sb));
		System.out.println("呪遂勲 : " + sb.capacity());
		System.out.println("掩戚 : " + sb.length());
		System.out.println("===================");
//		痕井 板 sb : 鋼ぞぞぞ亜括!陥級 繕榎幻 毘鎧室推!!!
//		爽社葵 : 2018699554
//		呪遂勲 : 42
//		掩戚 : 21
		
		// 4. reverse() : StringBuilder -> 蝕生稽 郊荷澗
		sb.reverse();
		System.out.println("痕井 板 sb : " + sb.toString());
		System.out.println("爽社葵 : " + System.identityHashCode(sb));
		System.out.println("呪遂勲 : " + sb.capacity());
		System.out.println("掩戚 : " + sb.length());
		System.out.println("===================");
//		痕井 板 sb : !!!推室鎧毘 幻榎繕 級陥!括亜ぞぞぞ鋼
//		爽社葵 : 2018699554
//		呪遂勲 : 42
//		掩戚 : 21
		
	}
	
	public void method3() {
		StringBuilder sb = new StringBuilder("JavaProgram");
		
		sb.append("API").delete(4, 11).reverse();
		// 五社球 食君腰 戚嬢辞 硲窒 亜官
		System.out.println(sb);
		
		// 五社球 鋼発莫戚 乞砧 StringBuilder 戚糠稽 五社球研 戚嬢辞 硲窒拝 呪 赤製
		// -> 背雁 五社球税 衣引稽 sb税 爽社葵戚 鋼発鞠奄 凶庚
		// => 五社球 端戚閑(五社球 戚嬢床奄)
		// -> 呪楳 -> 鋼発 -> 呪楳 - 鋼発 .. 莫殿

	}

}
