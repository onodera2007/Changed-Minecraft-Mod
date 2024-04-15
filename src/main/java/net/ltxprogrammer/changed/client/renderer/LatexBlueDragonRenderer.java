package net.ltxprogrammer.changed.client.renderer;

import net.ltxprogrammer.changed.Changed;
import net.ltxprogrammer.changed.client.renderer.layers.CustomEyesLayer;
import net.ltxprogrammer.changed.client.renderer.layers.GasMaskLayer;
import net.ltxprogrammer.changed.client.renderer.layers.LatexParticlesLayer;
import net.ltxprogrammer.changed.client.renderer.layers.TransfurCapeLayer;
import net.ltxprogrammer.changed.client.renderer.model.LatexBlueDragonModel;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorLatexMaleDragonModel;
import net.ltxprogrammer.changed.entity.beast.LatexBlueDragon;
import net.ltxprogrammer.changed.util.Color3;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class LatexBlueDragonRenderer extends LatexHumanoidRenderer<LatexBlueDragon, LatexBlueDragonModel, ArmorLatexMaleDragonModel<LatexBlueDragon>> {
    public LatexBlueDragonRenderer(EntityRendererProvider.Context context) {
        super(context, new LatexBlueDragonModel(context.bakeLayer(LatexBlueDragonModel.LAYER_LOCATION)),
                ArmorLatexMaleDragonModel::new, ArmorLatexMaleDragonModel.INNER_ARMOR, ArmorLatexMaleDragonModel.OUTER_ARMOR, 0.5f);
        this.addLayer(new LatexParticlesLayer<>(this, getModel()));
        this.addLayer(TransfurCapeLayer.normalCape(this, context.getModelSet()));
        this.addLayer(new CustomEyesLayer<>(this, context.getModelSet(), CustomEyesLayer.fixedColor(Color3.WHITE),CustomEyesLayer.fixedColor(Color3.parseHex("#26c841"))));
        this.addLayer(GasMaskLayer.forSnouted(this, context.getModelSet()));
    }

    @Override
    public ResourceLocation getTextureLocation(LatexBlueDragon p_114482_) {
        return Changed.modResource("textures/latex_blue_dragon.png");
    }
}