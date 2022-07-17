package com.example.android.nsk.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.nsk.Places;
import com.example.android.nsk.Adapters.PlacesAdapter;
import com.example.android.nsk.R;

import java.util.ArrayList;
import java.util.List;

public class TheatersFragment extends Fragment {

    RecyclerView placesRecyclerView;
    PlacesAdapter placesAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_recycler, container, false);

        placesRecyclerView = rootView.findViewById(R.id.recyclerView_place);

        List<Places> placesList = new ArrayList<>();
        placesList.add(new Places(1, "teatr_opery_i_baleta",                "Театр Оперы и Балета",                "#DDD273", " Новосибирский государственный академический театр оперы и балета — российский театр оперы и балета. Открылся в 1945 году. Является одним из ведущих театров России. Крупнейшее в России и СССР здание театра было сооружено в 1931—1941 годах, представляет собой сложный и уникальный архитектурный комплекс, и имеет статус объекта культурного наследия России федерального значения.\n" + "\n" + " Здание театра — крупнейшее в России театральное здание. Оно расположено на главной площади Новосибирска. После реконструкции в 2005 году Новосибирский театр — наиболее современно оборудованный в России.\n" + "\n" + " Здание состоит из шести объёмов: корпуса, в котором на первом этаже расположены кассовый зал и вестибюль, а на втором и третьем — концертный зал, цилиндрического объёма зрительного зала (с кольцевыми фойе); сценического блока со сценой глубиной 30 м и колосниками высотой 29,5 м. К сцене примыкают боковые крылья, в которых размещаются кулуары сцены, административные помещения, репетиционные залы, костюмерные и декорационные цеха. К сценической коробке сзади примыкает полуцилиндр склада декораций. Главная конструкция здания — большой купол диаметром 60 м и высотой 35 м, уникальная конструкция, без контр-форсов, ферм или колонн, поддерживающая сама себя. Средняя толщина купола — 8 см, и его отношение толщины к радиусу меньше, чем у скорлупы куриного яйца."));
        placesList.add(new Places(2, "novosibirskiy_oblastnoy_teatr_kykol", "Новосибирский областной театр кукол", "#DDD273", " Новосибирский областной театр кукол — театральное учреждение, расположенное в Железнодорожном районе Новосибирска, на пересечении улиц Ленина и Революции.\n" + "\n" + " Основан в Новосибирске, в 1933 году как студия кукольников при ТЮЗе. 1 мая 1934 кукольный театр открыл первый сезон спектаклем «Петрушка в гостях у школьников». Первым режиссёром был В. Виноградов.\n" + "\n" + " В период с 1942 года по август 1945 года, театр был филиалом эвакуированного в Новосибирск Московского театра кукол под руководством С. Образцова. Позднее в театре работали заслуженный деятель искусств РФ Г. Кудрявцев, С. Горбушин, А. Свириденко, Н. Леонтьева, А. Панин, заслуженный работник культуры Бирюля Н. А., заслуженная артистка РФ Гущина О., заслуженный работник культуры РФ А. Корытный, С. Иванников, Д. Сидоров, Р. Ватолкин и др.\n" + "\n" + " На сегодняшний день в репертуаре театра более 25 спектаклей. Театр регулярно выезжает на гастроли по стране и за рубежом."));
        placesList.add(new Places(3, "arcticheskoe_sozvezdie",              "Театр \"Арктическое созвездие\"",     "#DDD273", " «Артистическое созвездие» возникло не очень давно, как реакция на необходимость возникновения чего-то нового в театральном мире. Спектакли по мотивам произведений классиков всегда пользуются спросом, но зрителю иногда требуются веселые, немного легкомысленные постановки современных авторов, которые заставляют не только задуматься, но и хорошенько посмеяться.\n" + "\n" +  " На такую тенденцию вовремя отреагировал Е. И. Важенин, который и создал своеобразную театральную антрепризу. Он пригласил разных актеров со всех театров города и страны, преимущественно это молодые яркие дарования, которые принимают участие в смелых театральных экспериментах.\n" + "\n" +  " Репертуар «Артсозвездия» необычный — это, в основном, комедийные постановки по малоизвестным произведениям, так что каждый спектакль несет много нового и интересного.\n"));
        //placesList.add(new Places(4, "java_2", "театр", "#DDD273", "test"));
        //placesList.add(new Places(5, "java_2", "театр", "#DDD273", "test"));

        setPlacesRecycler(placesList);


        return rootView;
    }

    private void setPlacesRecycler(List<Places> placesList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL,false);

        placesRecyclerView.setLayoutManager(layoutManager);

        placesAdapter = new PlacesAdapter(getActivity(),placesList);
        placesRecyclerView.setAdapter(placesAdapter);
    }
}