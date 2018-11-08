package cisc3130;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.util.List;

import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.bg.CircleBackground;
import com.kennycason.kumo.bg.PixelBoundryBackground;
import com.kennycason.kumo.font.scale.LinearFontScalar;
import com.kennycason.kumo.font.scale.SqrtFontScalar;
import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import com.kennycason.kumo.palette.ColorPalette;
import com.kennycason.kumo.palette.LinearGradientColorPalette;
import static java.awt.Color.white;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        
        
     final FrequencyAnalyzer frequencyAnalyzer = new FrequencyAnalyzer();
final List<WordFrequency> wordFrequencies = frequencyAnalyzer.load("text.txt");
final Dimension dimension = new Dimension(600, 600);
final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.PIXEL_PERFECT);
wordCloud.setPadding(1);
wordCloud.setBackground(new CircleBackground(300));
wordCloud.setColorPalette(new ColorPalette(new Color(0x4055F1), new Color(0x408DF1), new Color(0x40AAF1), new Color(0x40C5F1), new Color(0x40D3F1), new Color(0xFFFFFF)));
wordCloud.setFontScalar(new SqrtFontScalar(20, 60)); 
wordCloud.build(wordFrequencies);
wordCloud.writeToFile("circle.png");



}
}
