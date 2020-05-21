package com.politecnicomalaga.servlet;

import com.politecnicomalaga.modelo.Concatenacion;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.stream.Collectors;

@WebServlet(
        name = "PalabrasConcatenadas",
        urlPatterns = {"/palabras"}
)

public class PalabrasServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Concatenacion concatenacion = new Concatenacion();
        ArrayList<String> palabrasAConcatenar = new ArrayList<String>();
        String cadenaJsonResultado = "";
        String cadenaJson = req.getReader().lines().collect(Collectors.joining());
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject json = (JSONObject) jsonParser.parse(cadenaJson);
            String palabra1 = (String) json.get("palabra1");
            String palabra2 = (String) json.get("palabra2");
            String palabra3 = (String) json.get("palabra3");
            palabrasAConcatenar.add(palabra1);
            palabrasAConcatenar.add(palabra2);
            palabrasAConcatenar.add(palabra3);
            String resultadoConcatenacion = concatenacion.concatenar(palabrasAConcatenar);
            cadenaJsonResultado = "{\"status\":\"ok\",\"palabraEnviada1\":\"" + palabra1 + "\",\"palabraEnviada2\":\"" + palabra2 +
                            "\",\"palabraEnviada3\":\"" + palabra3 + "\",\"resultadoConcatenacion\":\"" + resultadoConcatenacion + "\"}";
        } catch (Exception e) {
            cadenaJsonResultado = "{\"status\":\"ko\"}";
            e.printStackTrace();
        }

        PrintWriter out = resp.getWriter();
        resp.setContentType("application/json");
        out.print(cadenaJsonResultado);
    }
}
