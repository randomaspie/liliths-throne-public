package com.lilithsthrone.game.character.body.valueEnums;

import java.util.List;
import com.lilithsthrone.utils.Util;


/**
 * Measurements are in inches. Measured in bust to underbust using the UK system.
 * 
 * @since 0.1.0
 * @version 0.1.83
 * @author Innoxia
 */
public enum CupSize {
	
	FLAT(Util.newArrayListOfValues("flat"), "flat", 0),

	// Training bra sizes:
	
	TRAINING_AAA(Util.newArrayListOfValues("almost unnoticeable", "insubstantial", "budding"), "training-AAA", 1) {
		@Override
		public boolean isTrainingBraSize() {
			return true;
		}
	},
	TRAINING_AA(Util.newArrayListOfValues("almost unnoticeable", "insubstantial", "budding"), "training-AA", 2) {
		@Override
		public boolean isTrainingBraSize() {
			return true;
		}
	},
	TRAINING_A(Util.newArrayListOfValues("almost unnoticeable", "insubstantial", "budding"), "training-A", 3) {
		@Override
		public boolean isTrainingBraSize() {
			return true;
		}
	},
	
	// Normal cup sizes:
	
	AA(Util.newArrayListOfValues("very tiny", "washboard", "minuscule", "slight"), "AA", 4),
	A(Util.newArrayListOfValues("tiny", "meager", "underdeveloped", "compact"), "A", 5),
	B(Util.newArrayListOfValues( "small", "below-average", "petite", "sporty"), "B", 6),
	C(Util.newArrayListOfValues("average", "average-sized", "cute", "modest"), "C", 7),
	D(Util.newArrayListOfValues("large", "above-average", "full", "ample", "big"), "D", 8),
	DD(Util.newArrayListOfValues("very large", "considerable", "fairly large", "hefty"), "DD", 9),
	E(Util.newArrayListOfValues("substantial", "sizeable", "generous"), "E", 10),
	F(Util.newArrayListOfValues("heavy", "heavyset", "polstered", "pillowy"), "F", 11),
	FF(Util.newArrayListOfValues("heavy", "heavyset", "polstered", "pillowy"), "FF", 12),
	G(Util.newArrayListOfValues("huge", "burdensome", "bountiful", "jumbo-sized"), "G", 13),
	GG(Util.newArrayListOfValues("huge", "burdensome", "bountiful", "jumbo-sized"), "GG", 14),
	H(Util.newArrayListOfValues("massive", "burdensome", "jumbo-sized"), "H", 15),
	HH(Util.newArrayListOfValues("massive", "burdensome", "jumbo-sized"), "HH", 16),
	J(Util.newArrayListOfValues("enormous", "unwieldy", "oversized"), "J", 17),
	JJ(Util.newArrayListOfValues("enormous", "unwieldy", "oversized"), "JJ", 18),
	K(Util.newArrayListOfValues("gigantic", "unwieldy", "oversized"), "K", 19),
	KK(Util.newArrayListOfValues("gigantic", "unwieldy", "oversized"), "KK", 20),
	L(Util.newArrayListOfValues("colossal", "immense", "oversized"), "L", 21),
	LL(Util.newArrayListOfValues("colossal", "immense", "oversized"), "LL", 22),
	M(Util.newArrayListOfValues("gargantuan", "immense", "oversized"), "M", 23),
	MM(Util.newArrayListOfValues("titanic", "immense", "oversized"), "MM", 24),
	N(Util.newArrayListOfValues("monstrous", "immense", "oversized"), "N", 25),
	
	// Hyper sizes:
	
	X_AA(Util.newArrayListOfValues("extreme"), "X-AA", 26),
	X_A(Util.newArrayListOfValues("extreme"), "X-A", 27),
	X_B(Util.newArrayListOfValues("extreme"), "X-B", 28),
	X_C(Util.newArrayListOfValues("extreme"), "X-C", 29),
	X_D(Util.newArrayListOfValues("extreme"), "X-D", 30),
	X_DD(Util.newArrayListOfValues("extreme"), "X-DD", 31),
	X_E(Util.newArrayListOfValues("extreme"), "X-E", 32),
	X_F(Util.newArrayListOfValues("extreme"), "X-F", 33),
	X_FF(Util.newArrayListOfValues("extreme"), "X-FF", 34),
	X_G(Util.newArrayListOfValues("extreme"), "X-G", 35),
	X_GG(Util.newArrayListOfValues("extreme"), "X-GG", 36),
	X_H(Util.newArrayListOfValues("extreme"), "X-H", 37),
	X_HH(Util.newArrayListOfValues("extreme"), "X-HH", 38),
	X_J(Util.newArrayListOfValues("extreme"), "X-J", 39),
	X_JJ(Util.newArrayListOfValues("extreme"), "X-JJ", 40),
	X_K(Util.newArrayListOfValues("extreme"), "X-K", 41),
	X_KK(Util.newArrayListOfValues("extreme"), "X-KK", 42),
	X_L(Util.newArrayListOfValues("extreme"), "X-L", 43),
	X_LL(Util.newArrayListOfValues("extreme"), "X-LL", 44),
	X_M(Util.newArrayListOfValues("extreme"), "X-M", 45),
	X_MM(Util.newArrayListOfValues("extreme"), "X-MM", 46),
	X_N(Util.newArrayListOfValues("extreme"), "X-N", 47),

	XX_AA(Util.newArrayListOfValues("hyper"), "XX-AA", 48),
	XX_A(Util.newArrayListOfValues("hyper"), "XX-A", 49),
	XX_B(Util.newArrayListOfValues("hyper"), "XX-B", 50),
	XX_C(Util.newArrayListOfValues("hyper"), "XX-C", 51),
	XX_D(Util.newArrayListOfValues("hyper"), "XX-D", 52),
	XX_DD(Util.newArrayListOfValues("hyper"), "XX-DD", 53),
	XX_E(Util.newArrayListOfValues("hyper"), "XX-E", 54),
	XX_F(Util.newArrayListOfValues("hyper"), "XX-F", 55),
	XX_FF(Util.newArrayListOfValues("hyper"), "XX-FF", 56),
	XX_G(Util.newArrayListOfValues("hyper"), "XX-G", 57),
	XX_GG(Util.newArrayListOfValues("hyper"), "XX-GG", 58),
	XX_H(Util.newArrayListOfValues("hyper"), "XX-H", 59),
	XX_HH(Util.newArrayListOfValues("hyper"), "XX-HH", 60),
	XX_J(Util.newArrayListOfValues("hyper"), "XX-J", 61),
	XX_JJ(Util.newArrayListOfValues("hyper"), "XX-JJ", 62),
	XX_K(Util.newArrayListOfValues("hyper"), "XX-K", 63),
	XX_KK(Util.newArrayListOfValues("hyper"), "XX-KK", 64),
	XX_L(Util.newArrayListOfValues("hyper"), "XX-L", 65),
	XX_LL(Util.newArrayListOfValues("hyper"), "XX-LL", 66),
	XX_M(Util.newArrayListOfValues("hyper"), "XX-M", 67),
	XX_MM(Util.newArrayListOfValues("hyper"), "XX-MM", 68),
	XX_N(Util.newArrayListOfValues("hyper"), "XX-N", 69),

	XXX_AA(Util.newArrayListOfValues("unbelievably-huge"), "XXX-AA", 70),
	XXX_A(Util.newArrayListOfValues("unbelievably-huge"), "XXX-A", 71),
	XXX_B(Util.newArrayListOfValues("unbelievably-huge"), "XXX-B", 72),
	XXX_C(Util.newArrayListOfValues("unbelievably-huge"), "XXX-C", 73),
	XXX_D(Util.newArrayListOfValues("unbelievably-huge"), "XXX-D", 74),
	XXX_DD(Util.newArrayListOfValues("unbelievably-huge"), "XXX-DD", 75),
	XXX_E(Util.newArrayListOfValues("unbelievably-huge"), "XXX-E", 76),
	XXX_F(Util.newArrayListOfValues("unbelievably-huge"), "XXX-F", 77),
	XXX_FF(Util.newArrayListOfValues("unbelievably-huge"), "XXX-FF", 78),
	XXX_G(Util.newArrayListOfValues("unbelievably-huge"), "XXX-G", 79),
	XXX_GG(Util.newArrayListOfValues("unbelievably-huge"), "XXX-GG", 80),
	XXX_H(Util.newArrayListOfValues("unbelievably-huge"), "XXX-H", 81),
	XXX_HH(Util.newArrayListOfValues("unbelievably-huge"), "XXX-HH", 82),
	XXX_J(Util.newArrayListOfValues("unbelievably-huge"), "XXX-J", 83),
	XXX_JJ(Util.newArrayListOfValues("unbelievably-huge"), "XXX-JJ", 84),
	XXX_K(Util.newArrayListOfValues("unbelievably-huge"), "XXX-K", 85),
	XXX_KK(Util.newArrayListOfValues("unbelievably-huge"), "XXX-KK", 86),
	XXX_L(Util.newArrayListOfValues("unbelievably-huge"), "XXX-L", 87),
	XXX_LL(Util.newArrayListOfValues("unbelievably-huge"), "XXX-LL", 88),
	XXX_M(Util.newArrayListOfValues("unbelievably-huge"), "XXX-M", 89),
	XXX_MM(Util.newArrayListOfValues("unbelievably-huge"), "XXX-MM", 90),
	XXX_N(Util.newArrayListOfValues("unbelievably-huge"), "XXX-N", 91);

	private List<String> names;
	private String cupSizeName;
	private int measurement;

	private CupSize(List<String> names, String cupSizeName, int measurement) {
		this.names = names;
		this.cupSizeName = cupSizeName;
		this.measurement = measurement;
	}
	
	public boolean isTrainingBraSize() {
		return false;
	}
	
	/**
	 * @return The minimum size which is regarded as a character 'having breasts' by the game.
	 */
	public static CupSize getMinimumCupSizeForBreasts() {
		return CupSize.AA;
	}
	
	public static CupSize getMinimumCupSizeForEggIncubation() {
		return CupSize.C;
	}
	
	public static CupSize getMinimumCupSizeForPaizuri() {
		return CupSize.C;
	}
	
	public static CupSize getMinimumCupSizeForPenetration() {
		return CupSize.C;
	}

	/**
	 * @param size Measurement in inches from bust to underbust.
	 */
	public static CupSize getCupSizeFromInt(int size) {
		for (CupSize cs : values()) {
			if (size == cs.measurement) {
				return cs;
			}
		}
		return XXX_N;
	}

	/**
	 * To fit into a sentence: "You have "+getDescriptor()+" breasts."
	 */
	public String getDescriptor() {
		return Util.randomItemFrom(names);
	}

	public String getCupSizeName() {
		return cupSizeName;
	}

	public int getMeasurement() {
		return measurement;
	}
	
	public static CupSize getMaximumCupSize() {
		return XXX_N;
	}
}
