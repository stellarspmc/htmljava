package fun.spmc.test;

import fun.spmc.html.filetype.Compile;
import fun.spmc.html.filetype.HTMLFile;
import fun.spmc.html.objects.Hyperlink;
import fun.spmc.html.util.UDim2;
import fun.spmc.html.util.UDim2Utils;

@Compile()
public class TestHTML extends HTMLFile {

    @Override
    public void head() {

    }

    @Override
    public void body() {
        Hyperlink.builder().href("https://spmc.fun").size(UDim2Utils.fromOffset(20, 20)).build();
    }
}
