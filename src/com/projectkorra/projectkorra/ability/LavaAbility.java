package com.projectkorra.projectkorra.ability;

import org.bukkit.entity.Player;

import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.configuration.better.configs.abilities.AbilityConfig;

public abstract class LavaAbility<C extends AbilityConfig> extends EarthAbility<C> implements SubAbility {

	public LavaAbility(final C config, final Player player) {
		super(config, player);
	}

	@Override
	public Class<? extends Ability> getParentAbility() {
		return EarthAbility.class;
	}

	@Override
	public Element getElement() {
		return Element.LAVA;
	}

}
