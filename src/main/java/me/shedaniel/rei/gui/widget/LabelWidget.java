package me.shedaniel.rei.gui.widget;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;

import java.util.ArrayList;
import java.util.List;

public class LabelWidget extends Gui implements IWidget {
    
    public int x;
    public int y;
    public String text;
    protected FontRenderer fontRenderer;
    
    public LabelWidget(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
        this.fontRenderer = Minecraft.getInstance().fontRenderer;
    }
    
    @Override
    public List<IWidget> getListeners() {
        return new ArrayList<>();
    }
    
    @Override
    public void draw(int mouseX, int mouseY, float partialTicks) {
        drawCenteredString(fontRenderer, text, x, y, -1);
    }
    
}
