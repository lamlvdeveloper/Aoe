package com.example.aoe.database;

import com.example.aoe.model.Empire;

import java.util.ArrayList;
import java.util.List;

public class EmpireData {
    private static List<Empire> empireList = new ArrayList<>();

    public static List<Empire> data() {
        if (empireList.size() > 0) {
            return empireList;
        } else {

            List prosList1 = new ArrayList();
            prosList1.add("+25% Tốc Độ Di Chuyển cho nông dân nên hiệu quả làm việc rất nhanh và linh hoạt. Dễ dàng chạy thoát khi bị quân địch truy đuổi hoặc làm nhiệm vụ đảo khi giao tranh.");
            prosList1.add("+40% Tốc Độ Bắn của cung R. Có bánh xe và là một trong số những cung tuyển ở đời 3. Với kỹ năng tốt có Assyrian trong tay bạn sẽ không ngán bất cứ loại quân AOE nào khác.");
            prosList1.add("Đời 4: Pháo to (Cẩu đá) và pháo bẹt (nỏ/ná) có thể nâng cấp lên Thần, BB Thần (Z điên). Có bắn chặn và tốc độ bắn cũng tương đối nhanh so với bình thường. Chòi canh cũng thuộc hàng có số má. Tuy nhiên chúng ta thường bắt gặp Assy đời 4 hay chơi ngựa C kẹp pháo sẽ đem sức mạnh tốt.");
            List consList1 = new ArrayList();
            consList1.add("Không có nâng cấp đầu máu trong nhà công nghệ (BC).");
            consList1.add("Không có sọc đôi (ngựa 2 đầu).");
            consList1.add("Không có lửa.");
            consList1.add("Không có Voi.");
            Empire empire1 = Empire.builder()
                    .name("Assyrian")
                    .description("Assyrian vốn là một đất nước có thật xuất hiện từ cuối thế kỷ 25 kéo dài mãi đến những năm 608 trước Công Nguyên của người Akkad ở thượng nguồn sông Tigris miền bắc Iraq. Đây được xem như một đế quốc hùng mạnh từng nắm quyền thống trị trong lịch sử.")
                    .prosList(prosList1)
                    .consList(consList1)
                    .upLevel("Do đặc điểm nông dân đi nhanh nên việc dò đồ cũng như ăn quả, lùa hươu rất nhanh. Đôi khi gặp khó khăn trong quá trình câu voi do voi hay bị quay đầu. Nhưng Assy trong đế chế chắc chắn có một chút lợi thế trong khâu ép đồ, lên đời. Thông thường với 25-28 dân các cao thủ có thể click đời ở phút thứ 10-11. Trong thời gian chờ đợi lên xong đời 3 có thể xây được tất cả 3 nhà BS + 6-8 ruộng tại nhà chính. Với lượng thực + gỗ như vậy hoàn toàn có khả năng sóc đều 5 nhà cung trong thời điểm đầu.")
                    .defense("Do lợi thế là chiến đấu bằng nhà BA chơi ngựa R nên chúng ta phải chọn địa thế xây nhà trên dốc nhằm được công damage bắn và phòng thủ khiến đối phương rất khó tấn công. Gặp nhà kín hoặc bên kia cũng đánh thủ cần chủ động xây thêm BS, xây ruộng để phát triển tay to.")
                    .attack("Assyrian trong game đế chế được gọi là quân của đời 3, và gần như các game thủ sẽ chơi cung kể cả là solo 1-1, 2-2 hay đánh team 4-4. Tùy vào tình hình lên đời, địa thế nhà cửa và tương quan lực lượng giữa địch và ta mà người chơi đưa ra quyết công nhà. Cung Assyrian bắn rất nhanh nên kill dân và lính rất dễ. Có thể áp dụng chiến thuật vẩy E để bắt quân, chiến thuật hit and run (bắn và chạy) để rỉa máu quân địch. Tức là bắn một nhịp, lùi một nhịp để tránh sát thương. Một trong những điểm mạnh của các cao thủ cần cung đó là thuật điều R. Chúng ta sẽ tách 1-2 con hoặc một nhóm nhỏ ra để chạy ngang đội hình đối phương thu hút quân địch bắn theo mục tiêu đang di chuyển và thường nó sẽ bị trượt. Đôi khi ta lừa để cho địch vào rồi vây bắt hoặc đổi nhà tùy từng trường hợp. Theo thời gian cần đóng thêm nhà cung để mua quân nhanh hơn, nhiều hơn.")
                    .build();

            List prosList2 = new ArrayList();
            prosList2.add("+30% Tốc Đồ Hồi Mana cho phù thủy nên thường được game thủ gọi với cái tên là “Siêu Hù”.");
            prosList2.add("+30% Tốc Độ nông dân khai thác đá nên rất có lợi đối với luật chơi có thành chòi.");
            prosList2.add("x2 Lượng Máu tháp canh (Chòi).");
            prosList2.add("400 Máu đối với thành nên phá rất lâu, dễ dàng bo nhà phòng thủ.");
            prosList2.add("Có bánh xe và đầy đủ các loại quân như: ngựa R bắn, cung A, lạc đà, quẩy đá, phù thủy, sọc đôi… Có nâng cấp lửa và đầu máu");
            List consList2 = new ArrayList();
            consList2.add("Không có Voi trong nhà ngựa BL.");
            consList2.add("Không có cẩu đá thần.");
            consList2.add("Không có quân nào tuyển.");
            consList2.add("Các công nghệ trong nhà BS chỉ nâng cấp được 2 lần");
            Empire empire2 = Empire.builder()
                    .name("Babylonian")
                    .description("Babylonian được biết đến với tên gọi khác là đế quốc Chaldean có chiều dài lịch sử tồn tại từ năm 636 đến năm 539 trước Công Nguyên. Ngày nay chúng ta vẫn biết đến nơi đây với nhiều côn trình được công nhận là kỳ quan thế giới được xây dựng thủ công bằng đá từ xa xưa. Ví dụ như vườn treo Babylon. Vào năm 626 trước Công Nguyên nhân dân thành Babylonia dưới ngọn cờ khởi nghĩa của thủ lĩnh Nabopolassar đã giải phóng dân tộc mình trước sự áp bức nhiều thế kỷ của Assyrian. Có địa thế nằm ở vị trí giao thương quan trọng kết nối từ Châu Á sang Châu Phi, Châu Âu và Địa Trung Hải nên nơi đây thường xuyên diễn ra nhiều cuộc xâm lược từ các nước láng giềng xung quanh.")
                    .prosList(prosList2)
                    .consList(consList2)
                    .upLevel("Không có lợi thế lên đời 2, đời 3 nên phải tập trung dò bản đồ sớm. Có thể cần đến 2 dân đi dò theo các hướng khác nhau để nhanh chóng tìm đủ đồ ăn. Không nên xin nhiều dân làm chậm thời gian click đời.")
                    .defense("Với lượng máu của thành Babylonian rất cao nên theo luật được phép sử dụng thì đây sẽ là vũ khí lợi hại khiến đối phương phải ngán ngẩm nếu xây thành để bo nhà. Tốc độ bắn và sát thương của chòi canh tốt và có thể nâng cấp lên thần là vũ khí lợi hại trong đời 4.")
                    .attack("Do không có bất kỳ loại quân nào tuyển có ưu thế vượt trội hơn đối thủ ngoài pháp sư phù thủy nên theo kinh nghiệm các game thủ thường chọn phương án ép đời sớm và chủ động tấn công bằng công thức lạc đà kẹp phù hoặc chấp nhận đánh cung R. Riêng đối với những nước không có bánh xe đánh quân vàng (như lạc đà, ngựa chém) thì khi cầm babylon nên đánh nhiều dân, bo kín nhà và thủ hù sẽ là phương án hiệu quả nhất.\n" +
                            "\n" +
                            "Nếu đánh Babylonian trong AOE về lâu dài có thể chuyển sang cung A để có đôi chút lợi thế và nghĩ đến chuyện lên 4. Có lửa, cẩu đá to và cả sọc đôi sẽ giúp người chơi có nhiều lựa chọn hơn khi chiến đấu ở đời 4.")
                    .build();

            List prosList3 = new ArrayList();
            prosList3.add("+25% Máu cho các loại voi và xọc xiên. Nâng cấp tối đa lên thần.");
            prosList3.add("Chòi canh Catha thuộc loại mạnh trong luật có thành chòi nhưng rất ít chơi ở Việt Nam. Nếu thi đấu theo luật Trung Quốc thì mới có lợi thế.");
            prosList3.add("Có nâng cấp lửa và băn chặn trong nhà công nghệ BC đời 4.");
            prosList3.add("Có bẹt thần Balista.");
            List consList3 = new ArrayList();
            consList3.add("Không có Cung R hay xọc đơn. Là quân đánh vàng.");
            consList3.add("Cung A 1 áo, không có 2 áo.");
            consList3.add("Không có cẩu đá to.");
            Empire empire3 = Empire.builder()
                    .name("Carthaginian")
                    .description("Carthaginian có nguồn gốc lịch sử là một thành phố thuộc phía Đông hồ Tunis. Trong sử sách Hy Lạp còn ghi lại rằng đây là một thành phố được lập lên bởi người Phoenician trong cuộc hành trình khám phá và chinh phục những mảnh đất mới. Dưới sự chỉ huy của thủ lĩnh Elissa trong thời gian ngắn đã biến Cathago lúc đó trở thành một đế chế có sự phát triển nhanh chóng đáng kinh ngạc, nổi lên như một nền văn minh huy hoàng nhất vào năm 814 trước Công Nguyên. Tuy nhiên sau nhiều cuộc giao tranh với quân đội các nước Syracuse, Pulich, Vandal và người Hồi Giáo dần trở nên suy tàn và bị hủy diệt vào năm 698 TCN.")
                    .prosList(prosList3)
                    .consList(consList3)
                    .upLevel("Tập trung dò nhà, ép đồ lên đời sớm hơn để tạo lợi thế và chơi lạc đà ở đời 3 theo chiến thuật đánh phủ đầu khiến đối phương không kịp trở tay và kéo dài. Nếu để lâu đối phương thủ hù thì rất khó chơi. Vì Cartha trong game AOE là quân Gold nên chủ động điều phối dân ăn vàng và làm thịt nhiều hơn, hạn chế nông dân khai thác gỗ.")
                    .defense("Vì đời 3 catharian không có quân tạo đột biến nên gặp quân địch mạnh hơn nên chọn giải pháp tấn công nhanh gọn thay vì phòng thủ. Càng để lâu chúng ta càng bất lợi. Kể cả chém chuyển cung A thì 1 áo cũng rất yếu và vẫn có thể bị phù thủy thu phục. Nếu gặp đối phương cầm quân tương tự như Choson, Greek, Persian thì phương án trâu phù cũng tương đối hiệu quả. Chú ý xin thêm dân để đua phát triển tay to.")
                    .attack("Xây 2 nhà BL xin đều lạc đà, cứ có quân là đẩy ngay. Giữ ngựa dò để dò nhà và tìm dân dễ dàng trong trường hợp quân địch chạy trốn. Kẹp thêm phù thủy để tăng thêm sức mạnh. Phù cả quân cả dân nếu có thể. Gặp Mace thì có thể chơi Y vì lợi thế về máu. Trong đánh team được đồng đội bơm đồ, nhồi đồ lên 4 thì chuyển chơi voi điên Carthaginian san bằng tất cả. Lượng HP lên tới 750 máu rất trâu và lì đòn.")
                    .build();

            List prosList4 = new ArrayList();
            prosList4.add("+2 Tầm Xa đối với chòi canh và tương đối mạnh (Tức là tối đa 7+5 +2). Về cuối trận khi đã ăn hết thực – gỗ chúng ta chuyển sang chơi bằng đá. Với chiến thuật dân đi đến đâu đóng chòi đến đó thì choson sẽ khiến bạn phải e dè.");
            prosList4.add("-30% giá mua Phù Thủy nên rất rẻ. Chỉ 85 Gold/1 con. Vì vậy chúng ta có thể xây nhiều nhà BP để trâu hù, hoặc chỉ cần ít nông dân làm vàng nhưng vẫn có thể xin hù đều tay.");
            prosList4.add("BB trâu máu, giá rẻ, 1 nhà BE có thể mua được 8 con. Vì vậy đời 4 Z điên Choson dễ dàng tràn bản đồ với sức mạnh khó cưỡng. Do có cả giáp đồng nên đôi khi một số người chơi Z đời 3 chống cung tạo ra sự bất ngờ cho đối thủ mà đạt hiệu quả cao.");
            prosList4.add("Có bẹt thần Balista đời 4");
            List consList4 = new ArrayList();
            consList4.add("Chỉ có ngựa chém. Không có các đơn vị quân quen thuộc đối với quân có thể nâng cấp bánh xe như: Cung R, ngựa sọc, lạc đà.");
            consList4.add("Cung A chỉ có 1 áo rất yếu.");
            consList4.add("Không có nâng cấp đầu máu hay lửa trong nhà BC.");
            Empire empire4 = Empire.builder()
                    .name("Choson")
                    .description("Choson chính là một liên minh của tập hợp các bộ lạc nằm trên bán đảo Triều Tiên bị chia cắt bởi đất nước Hàn Quốc ở ngay Châu Á chúng ta. Đế quốc này nổi tiếng từ cổ đại xa xưa với những trận đánh bao gồm cả phòng thủ lẫn tấn công thời đồ sắt, đồ đồng. Thời gian tồn tại từ năm 2333 đến năm 108 trước Công Nguyên, sau đó thì bị hủy diệt bởi nhà Hán (Trung Quốc). Đa số quân đội nước này sử dụng kiếm sắt và cung. Một số ít những binh lính thuộc dạng nhà có điều kiện mới có thể trang bị ngựa cho mình. Vì thế khi chơi Choson chúng ta thường chỉ có ngựa chém C.")
                    .prosList(prosList4)
                    .consList(consList4)
                    .upLevel("Nông dân Cho Son trong AOE bình thường như các loại phu khác không có lợi thế gì hơn. Vì vậy công thức lên đời phụ thuộc nhiều vào thế bài, đồ ăn và kỹ năng thao tác của game thủ. Ép đời sớm sẽ có bạn ưu thế ban đầu để tấn công sớm đối thủ. Thông thường nếu map không giàu mọi người thường chém sớm với 23 dân. Chú ý việc giữ dò rất quan trong khi đánh chém.")
                    .defense("Nếu đối đầu với những quân đánh Vàng như: Persian, Catha, Greek, Yamato thì chủ động trâu dân thủ hù hoặc công hù là chiến thuật rất hiệu quả. Tăng thêm dân ăn vàng hoặc nâng cấp công nghệ trong BM để khai thác hiệu quả hơn. Có thể xây 4-5 nhà phù thủy (BP) mà vẫn xin đều đều khiến đối thủ ngao ngán. Game thủ Chim Sẻ Đi Nắng đã có rất nhiều trận dâng BP công 4 nhà hù đánh bại nhiều game thủ hàng đầu. Khi đánh team ưu tiên lên 4 và tràn Z điên. Trong luật Trung Quốc có thành chòi thì choson là quân được xem là có lợi thế.")
                    .attack("Click đời sớm, chém phủ đầu. Giữ ngựa dò để tìm dân nhanh hơn. Kẹp thêm phù thủy hoặc công hù để tạo đột biến. Sau khi lên 4 nếu muốn chơi Z điên thì phải xây rất nhiều BB vì giá mua rẻ.")
                    .build();

            List prosList5 = new ArrayList();
            prosList5.add("+33% Máu đối với cung R (93 HP) và sọc đơn (ngựa giấy: 133 HP). Nhiều máu nhất so với các loại quân đế chế khác. Sau khi nâng cấp đầu máu trong nhà công nghệ (BC) sẽ là 106 và 152 HP so với 80 máu.");
            prosList5.add("+3 Gold khi làm vàng. Tức là 10+3 cho mỗi lần nông dân di chuyển đào vàng nên tốc độc và số lượng khai thác tăng lên nhanh chóng.");
            prosList5.add("+3 Tầm Xa cho phù thủy. Với việc đào nhiều vàng và phạm vi hoạt động rộng nên hù Egyptian rất tuyển khi chiến đấu. Khi lên đời 4 sẽ là +6. Các quân như Greek, Persian, Carthaginian, Yamato hay bất kỳ quân nào đánh chém hoặc lạc đà đều tỏ ra e dè.");
            prosList5.add("Có lửa, có bắn chặn đời 4.");
            prosList5.add("Ngựa Đôi mạnh nhất trong các loại quân khi được lên Max công nghệ (Công 9+7, Giáp 2+6).");
            List consList5 = new ArrayList();
            consList5.add("Địa thế nhà Egypt thường có ít gỗ hoặc ở xa nên mất thời gian nông dân khai thác. Vì vậy bị chậm chễ trong vệc xây BS đầu. Chú ý tập trung dân ăn gỗ thời điểm ban đầu.");
            consList5.add("Không có cẩu đá to.");
            consList5.add("Không có xe bắn tên Balista.");
            Empire empire5 = Empire.builder()
                    .name("Egyptian")
                    .description("Egyptian chính là Ai Cập cổ đại từ xa xưa và cũng là đất nước Ai Cập ngày này. Đây là một quốc gia có lịch sử tồn tại và phát triển xếp vào loại sớm nhất và lâu đời trên thế giới (7000 năm từ 3100 đến năm 332 TCN, 80 triều đại các Pharaon). Chúng ta biết đến với những biểu tượng đặc trưng như kim tự tháp, xác ướp và hầm mộ của các vị Pha-ra ông cùng nền văn minh nông nghiệp, chữ viết, tôn giáo hưng vượng. Vị trí địa lý nằm ở vùng Bắc Phi có địa thế quan trọng với khoảng 90% diện tích là sa mạc khô cằn. Có dòng sông Nin chạy quả trải dài 6,670 km.")
                    .prosList(prosList5)
                    .consList(consList5)
                    .upLevel("Nông dân Egypt không có lợi thế gì về khai thác quả, ăn voi hươu ở đời 1 và 2 nên cũng giống như những loại quân khác. Do là đất nước có phần lớn lãnh thổ là sa mạc khô cằn nên nhà thường có ít gỗ, rừng dừa, ở vị trí xa. Cần bố trí phu làm gỗ để nhanh chóng đặt nhà BS đầu. Lên đời 3 nông dân ăn vàng nhanh nên thường game thủ chỉ bố trí 4-5 dân khai thác.")
                    .defense("Tùy vào thế trận và quân của đối phương mà đề ra phương án thích hợp. Nhưng thông thường ở đời 3 người chơi thường sẽ chọn cách chơi thuần cung R bắn hoặc kẹp sọc đơn để phát huy tối đa sức mạnh về máu của loại quân tuyển này. Với tư duy bo nhà và đánh nhiều đân (25-28 dân sau khi lên đời) thì đa số các game thủ sẽ chơi 4 đến 5 A. Chỉ có cung R Assyrian hoặc cung Hittile là có thể solo ngang ngửa, số còn lại chắc chắn sẽ chịu nhiều bất lợi. Một số trường hợp quân địch chơi lạc đà hoặc ngựa C thì có thể thủ phù thủy rất hiệu quả. Khi đánh về lâu dài, cắt 1-2 dân ra ăn vàng để nhanh chóng nâng cấp đầu máu tạo lợi thế vô cùng lớn.")
                    .attack("Ở đời 3, Egyptian có rất nhiều lựa chọn trong cách chơi và đều có ưu điểm hơn hẳn. Sẵn sàng chơi lạc đà kẹp phù thời điểm đầu rồi chuyển ngựa R thời điểm sau. Cách nào bạn cũng có lợi. Khi lên đời 4 thông thường sẽ cố gắng lên Sọc Đôi vì nó là mạnh nhất trong các loại quân, mua đạp đôi chỉ cần gỗ và thực rất thuận lợi khi map hết vàng. Ngựa đôi có thể đạp lan nên phá nhà và kill dân cũng như chiến đấu rất hiệu quả. Tràn đạp đôi sẽ quét sạch nhà và ruộng của đối phương dễ dàng. Cách duy nhất để chống đạp đôi đó là phải có Cung A minoan, Pháo bẹp thần, Voi điên Catharian, Persian, Y thần Greek, Macedonian với số lượng đông hơn thì mới có thể kháng cự lại được. Trong team 4-4 nếu có Egyptian trong đội hình, nhất là nằm trong cánh sẽ có một ưu thế vô cùng lớn.")
                    .build();

            List prosList6 = new ArrayList();
            prosList6.add("+30% Tốc độ di chuyển cho Xọc Xiên. Mặc dù không có sẵn chiêng đồng như Macedonian hay trâu máu như Y Carthaginian nhưng bù lại Y Greek lại chạy rất nhanh rất có lợi trong việc truy đuổi dân đối phương hoặc áp sát cung.");
            prosList6.add("Y thần đời 4 là nỗi khiếp sợ cho bất kỳ loại quân nào. Sẵn sàng chiến đấu kể cả với đạp đôi, voi điên.");
            prosList6.add("Pháo bẹt Balista và Cẩu Đá Catapult đều có thể nâng cấp lên Thần rất mạnh do có cả lửa và bắn chặn.");
            List consList6 = new ArrayList();
            consList6.add("Không có lạc đà, ngựa đơn hay cung R, cung A nên không có nhiều lựa chọn ngoài ngựa chém C.");
            consList6.add("Dễ dàng bị đối phương dùng phù thủy hù để khắc chế ngựa chém và lính xọc xiên mà không có cách nào hóa giải.");
            consList6.add("Xọc xiên mặc định không có giáp đồng mà phải nâng cấp trong BS và ít máu nên thường bị các loại cung hit and run rỉa máu và tiêu diệt.");
            Empire empire6 = Empire.builder()
                    .name("Greek ")
                    .description("Greek trong đế chế là đất nước Hy Lạp hiện nay có vị trí địa lý nằm ở bán đảo Balkan của Châu Âu. Đây cũng là một trong những nền văn minh phát triển hưng thịnh nhất thời kỳ cổ đại có tầm ảnh hưởng đến khu vực Địa Trung Hải nói chung. Vào cuối thế kỷ thứ 3 Hy Lạp bị chia cắt và thuộc phía Đông La Mã lập nên đế chế Byzantine. Đất nước này đã thực sự có những thời kỳ hoàng kim của mình tuy nhiên đã dần suy tàn trước những sự tấn công mạnh mẽ của người Hồi Giáo rồi bị tiêu diệt vào năm 1453 lập nên đế chế Ottoman mới. Sự cai trị tàn bạo và dã man của thể chế này, đông đảo người dân đã khởi xướng phong trào phục hưng Châu Âu lật đổ chính quyền và thành lập nên Hy Lạp hiện đại bây giờ. Quân đội nước này có sức tấn công và tinh thần chiến đấu cao nên tốc độ tiến công nhanh. Vũ khí họ thường sử dụng là những cây giáo dài cỡ 2,7 mét (Có tên gọi doru) cùng với 1 chiếc khiên che chắn.")
                    .prosList(prosList6)
                    .consList(consList6)
                    .upLevel("Phu Greek không có lợi thế gì nên tất cả phụ thuộc vào bài, vào kỹ năng và đôi chút may mắn của bạn. Đa số người chơi sẽ chọn chiến thuật đánh ít dân, chém sớm kẹp phù với 23 dân. Không để mất dò để tìm dân đối thủ.")
                    .defense("Không có ưu thế về lên đời, quân lính không có gì tạo đột biến nên ít người chọn cách phòng thủ. Tuy nhiên khi thi đấu với Catharian, Choson thì mình thường chơi trâu dân (25-27) sau đó nâng cấp đào vàng, và thủ hù với 2-3 nhà BP. Tiếp tục xin dân để phát triển tay to. Riêng với Mace hay Persian không có bánh xe thì mình không ngán vì có lợi thế dân chạy nhanh. Tuy nhiên về lâu dài cần chơi thêm K để chống cung A nếu đối phương chuyển cung. Dùng thù thủy hù cả cung A luôn. Khi lên 4 chơi K to nhưng nhớ phải kẹp bên pháo bẹt để chống chém hoặc lạc đà. Đôi khi mình chơi cung trần (T) kẹp K vì có cả lửa lẫn bắn chặn.")
                    .attack("Khi đối đầu với những quân có cung R hoặc ngựa xọc thì cách chém sớm ít dân là lựa chọn được ưu tiên. Nếu chơi trâu dân có thể khỏe thêm chút lực nhưng rất dễ bị đối thủ bo nhà chơi hù rất khó tấn công. Sóc đều 2 BL và xin thêm phù ở nhà. Đôi khi để giành chiến thắng bạn cần áp dụng tất cả những gì mình có và linh hoạt trong từng trường hợp. 1 ngựa dò + 1 kích chém có thể kill hết dân đối phương thì tốt. Gặp hàng bo nhà, bo bãi vàng nếu có nông dân gần đó có thể chơi quẩy đá hoặc cung trần, kể cả là vác dân khởi nghĩa đập E hoặc đập phù thủy. Nếu bài nghiệt, lượng gỗ và vàng nhiều có thể chọn giải pháp công K. Trong đánh team về cuối trận mà có thể lên 4 có thể đánh xọc xiên cũng rất lợi hại. Hoặc chơi cẩu đá thần chống cung R, cung C của đối phương.")
                    .build();

            List prosList7 = new ArrayList();
            prosList7.add("+1 Dame cho toàn bộ cung trong BA, gồm: Cung trần (T), ngựa bắn (R), Cung Horse (C), Voi cung.");
            prosList7.add("+100% Máu cho pháo bắn đá. Khi lên thần là 300 HP.");
            prosList7.add("Gần như đầy đủ các loại quân cung chém toàn diện.");
            prosList7.add("Nâng cấp max công nghệ và lên thần: Sọc đôi, voi điên, cẩu đá thần (Catapult), host thần.");
            prosList7.add("Có đầu máu, lửa, bắn chặn, tầm xa ở đời 4.");
            prosList7.add("Là quân rất mạnh trong bản đồ đế chế cả trong solo hay đánh team được nhiều game thủ ưa thích.");
            List consList7 = new ArrayList();
            consList7.add("Nông dân không có lợi thế khi làm việc.");
            consList7.add("Không có nhà BY chơi xọc xiên.");
            consList7.add("Không có cung A.");
            consList7.add("Không có pháo bẹt Ballista.");
            Empire empire7 = Empire.builder()
                    .name("Hittite")
                    .description("Hittite là tộc người Anatolian thời cổ đại thuộc phía bắc thành phố Ankara của đất nước Thổ Nhĩ Kỳ ngày nay. Đế chế này tồn tại vào những năm 1600 trước Công Nguyên và phát triển mạnh mẽ đến đỉnh điểm rơi vào khoảng giữa thế kỷ thứ 14. Vũ khí hầu hết được làm bằng đồng vì đồ sắt lúc đó rất hiếm. Đây chính là triều đại sử dụng các đồ dùng và vũ khí chiến đấu bằng sắt đầu tiên. Vì thế mà quân đội Hittile trong AOE được mặc định +1 damage cho cung bắn ngày từ thời điểm đầu. Tuy nhiên sau đó xảy ra nhiều cuộc chiến tranh với Ai Cập, Mitanni và đế quốc Assyrian nên đã bị tiêu diệt rồi sát nhập.")
                    .prosList(prosList7)
                    .consList(consList7)
                    .upLevel("Là quân có bánh xe nhưng nông dân ngoài khả năng di chuyển nhanh hơn ra thì không có thế mạnh gì về việc khai thác tài nguyên. Nhiều ý kiến còn cho rằng thế bài quân Hittite tương đôi xấu và ít đồ ăn vì vậy khó lên đời sớm hơn đối thủ. Đa số người chơi khi được cầm Hittile thường sẽ chọn phương án chơi cung R, mặc dù vẫn có những loại quân khác đời 3 như sọc đơn, ngựa chém, lạc đà. Nếu đánh cung thì nên chơi 24-27 dân, cố gắng thiết kế 3 BS ăn gỗ và xây ruộng.")
                    .defense("Thông thường chúng ta sẽ chơi chắc nhà, nhiều dân, bo kín nhà hoặc bo nhỏ các khu vực làm ăn để chống đối phương chém sớm. Sau khi lên đời 3 xin 1 cung T để thủ nhà. Nếu có đủ điều kiện về tài nguyên và check chỉ số thấy đối phương đào vàng thì nâng cấp luôn giáp cho cung để chống dò thời điểm đầu (cần 100 thịt). Nâng cấp chặt gỗ để khai thác gỗ nhanh hơn và tăng tầm xa cho cung (cần 120 gỗ + 100 thực, đừng bao giờ quên chi tiết nhỏ này). Nếu trình độ cao thì bạn có thể chơi 5BA, còn không thì chỉ nên xây 4 nhà cung và cố gắng sóc đều sẽ tốt hơn rất nhiều là con được con không. Nếu đánh về lâu dài thì đào 120 vàng để lên đầu máu. Thông thường ban đầu người chơi sẽ đánh cung thủ để có lợi thế. “Chỉ thủ là đụ”. Nếu bị đối phương chém sớm bung nhà, hoàn toàn có thể chọn giải pháp ăn hoang sóc quân và tụ cung. Trong team 4-4 thường sẽ được đồng đội ưu tiên nhồi đồ cho lên 4. Khi đã có bắn chặn và lửa, đạo quân Host thần + Cẩu đá to sẽ quét sạch bản đồ, san bằng tất cả.")
                    .attack("Khi bài giàu hoặc quân địch nghèo chúng ta có lợi thế lên đời sớm thì nên đẩy ngay cung T và turn cung đầu đi để dò nhà đối phương và kill dân. Do được + dame bắn ngay từ đầu nên tiêu diệt nông dân đối phương rất nhanh. Đôi khi thả 1 cung vào bãi làm ăn của đối phương cũng đủ gây nhức nhối. Khi đối đầu với Assyrian đôi khi chúng ta phải vất vả chống đỡ. Bở phu Assy có tốc độ di chuyển nhanh sẽ dễ dàng ép đời và có các đơn vị quân trước đi công nhà. Nhưng càng đánh chúng ta càng có ưu thế. Đặc biệt sau khi lên 80 máu hoặc thi đấu ở đời 4 thì Assyrian không có cửa với Hittite. Khi chiến đấu gặp Egyptian nên đi kill nông dân trước thay vì đấu cung xòng phẳng do bị bất lợi về máu. Khi tụ được số lượng lính đủ lớn hoặc hơn đối thủ thì ốp nhà hoặc điều cung. Vì có gần đủ các loại quân nên tùy trận, tùy bài, tùy quân địch mà đưa ra chiến thuật hợp lý. Ngay cả khi cầm Hittile chúng ta hoàn toàn có thể đánh chém thủ hù sau đó chuyển cung. Đời 4 có thể chơi cung lửa, hot thần + pháo to hoặc cũng có thể chơi đạp đôi khi hết vàng, vô cùng linh hoạt.")
                    .build();

            List prosList8 = new ArrayList();
            prosList8.add("+2 chiêng đồng chống cung ngay từ đời 3 cho Y Macedonian. Đây là lợi thế rất lớn vì nếu nâng cấp thêm +1 nữa là thành 0+3 giáp đồng sẽ rất trâu khi đối đầu với các loại cung chưa có lửa, kể cả các cung tuyển cũng phải e dè.");
            prosList8.add("-50% giảm một nửa giá mua cẩu đá nên rất rẻ. Dễ dàng xin K công nhà khi đối phương nhà bo kín, đánh thế thủ.");
            prosList8.add("Có Y Thần Macedonian, Voi Thần và cả Horse Thần đời 4.");
            prosList8.add("+2 bóng dò cho nông dân và các loại quân. Vì thế rất nhanh chóng tìm ra đồ ăn sớm để ép đời nhanh. Lợi thế ở chỗ ngựa dò và ngựa chém (C) đuổi dân hiếm khi bị mất hình như những quân khác.");
            prosList8.add("x4 lần khả năng chống phù thủy, nên khi đối đầu với loại quân này thường không ai xây BP chơi hù cả.");
            List consList8 = new ArrayList();
            consList8.add("Không có bánh xe nên dân di chuyển rất chậm chạp, khi bị đối phương truy đuổi thì xác định là chết.");
            consList8.add("Chỉ có ngựa chém, không xin được lạc đà, xọc đơn, cung R, phù thủy.");
            consList8.add("Pháo bắn đá không thể nâng cấp lên K to.");
            consList8.add("Không có đầu máu nâng cấp trong nhà công nghệ BC.");
            Empire empire8 = Empire.builder()
                    .name("Macedonian")
                    .description("Macedonian là đất nước tọa lạc ở khu vực phía đông nam của Châu Âu tiếp giáp với Serbia, Kosovo, Albania, Hy Lạp và Bulgaria. Lịch sử hình thành vào khoảng năm 4,5000 đến 3,500 trước Công Nguyên bắt nguồn từ bộ lạc Makednos. Sau này dưới sự chi huy của Alexandros đại đế trị vì đã biến quân đội Mace trở lên hùng mạnh và đánh thắng nhiều trận chiến lớn mở mang bờ cõi, xâm chiếm đất đai.")
                    .prosList(prosList8)
                    .consList(consList8)
                    .upLevel("Dân Macedonian có bóng dò rộng nên điều dân đi tìm đồ ở khoảng cách xa hơn bình thường rất hiệu quả. Việc câu voi tương đối dễ dàng cho dù thao tác tay của người chơi không nhanh hoặc voi xa nhà. Rất ít khi gặp trường hợp voi quay đầu. Tuy nhiên không có bánh xe là rào cản khiến cho lợi thế ép đời này giảm tác dụng nếu không đồ lùa về và phải di chuyển với khoảng cách xa. Thông thường game thủ sẽ đánh 23-24 dân cho bài chém sớm, có thể kẹp BY. Hoặc 25-26 dân nếu quyết định đánh cung A.")
                    .defense("Do là quân không có nhiều lựa chọn ở đời 3 nên nếu chọn phương án đánh thủ chúng ta có 2 hướng. 1 là trâu dân lên thẳng cung A. 2 là trâu dân và thủ bằng xọc xiên Y. Rải xọc xiên xung quanh nhà sẽ khiến đối phương vô cùng khó tấn công. Khi cầm loại quân này bạn cần có tư duy xây nhà với mục đích bo kín, tránh để quân địch lọt vào sẽ tiêu diệt sạch nông dân. Những bãi vàng, khu vực khai thác gỗ nên bo nhỏ. Ruộng xây cách 1-2 móng E để nhanh chóng chốt khi có biến.")
                    .attack("Nếu có lợi thế lên đời sớm hơn đối phương, thông thường game thủ sẽ chọn cách tấn công nhanh. Dò và chém Mace đuổi dân rất gắt và ít khi bị mất dấu. Trong trường hợp đối phương bo nhà có thể chơi thêm cả Y hoặc dâng K (vì giá rẻ) để quyết một phen sống mái, được ăn cả, ngã về không. Khi đánh team 3-3, 4-4 thì đây là loại quân khá đột biến do xọc xiên khắc chế lạc đà và chém, ngược lại gặp cung thì có lợi thế +2 chiêng đồng. Người chơi thường dâng L, dâng BY và được đồng đội bơm thêm đồ để chiến đấu. Nếu tụ được một kích Y đời 3 sẽ dễ dàng san bằng các cơ sở làm ăn, nhà cửa của đối thủ. Nếu ở trong cánh có thể trâu dân lên 4 đánh Horse Thần hoặc Y Thần cũng rất hiệu quả.")
                    .build();

            List prosList9 = new ArrayList();
            prosList9.add("+2 Tầm Xa cho Cung A. Khi nâng cấp tối đa chỉ số là 7+5. Đây là loại Cung A 2 áo mạnh nhất trong đế chế ngày từ đời 3. Khi lên đời 4 vẫn duy trì được điểm mạnh của mình. Đây là một quân chủ lực, gây đột biến trong team 4-4. Trong solo nếu lên xong cung A thì rất ít các quân trong AOE có thể chống cự lại được.");
            prosList9.add("+25% khả năng sản xuất nông nghiệp. Nếu để ý sẽ thấy nông dân Minoan làm ruộng rất nhanh, nhiều thực.");
            prosList9.add("-30% Giá mua tàu thuyền do nằm trên quốc đảo.");
            prosList9.add("Có bánh xe, có lửa, bắn chặn.");
            prosList9.add("Có cẩu đá thần, pháo bẹt Ballista lên thần cũng rất mạnh.");
            List consList9 = new ArrayList();
            consList9.add("Thời điểm ban đầu lên cung A 2 áo rất tốn lực nên không thủ tốt hoặc nhà nghèo khi đánh thẳng cung rất dễ bị đối phương công chết.");
            consList9.add("Cung A 2 áo bá đạo ở đời 3, tuy nhiên lên đời 4 bị K to, pháo thần khắc chế giảm đi nhiều sức mạnh.");
            consList9.add("Không có cung R, horse, các loại voi hay đạp đôi.");
            consList9.add("Là quân đánh vàng, nên với thế trận đánh lâu dài khi bản đồ hết vàng sẽ trở nên rất phế.");
            Empire empire9 = Empire.builder()
                    .name("Minoan")
                    .description("Minoan là một quốc đảo thuộc Crete khu vực Địa Trung Hải nằm gần Ai Cập cổ đại vào những năm từ 2,700 đến 2,500 trước Công Nguyên. Đây là nền văn minh được hình thành và phát triển sau sự tan rã của đế chế Hy Lạp (Greek). Tại đây người dân sinh sống chủ yếu dựa vào việc đánh bắt cá trên biển và thường xuyên phải chiến đấu chống trả lại bọn cướp biển khét tiếng. Chính vì lý do đó mà lực lượng thủy chiến của Minoan rất mạnh, các đơn vị quân cung bắn tên có lợi thế hơn hẳn về tầm xa.")
                    .prosList(prosList9)
                    .consList(consList9)
                    .upLevel("Dân Minoan không có lợi thế gì so với các loại quân khác. Bạn có 2 lựa chọn, ép đời sớm đánh chém hoặc chơi nhiều dân đánh thủ để lên cung. Khi đã lên đời 3 ưu tiên xây ruộng chắc nhà vì nông dân làm ruộng rất nhanh, lượng thực dồn lên rất dồi dào.")
                    .defense("Khi cầm Minoan ai cũng muốn lên Cung A, đơn giản bới nó là loại quân bá đạo bản đồ ở đời 3. Tuy nhiên nó rất tốn lực: 140 thực + 80 gỗ để lên cung 1 áo, 180 thực + 100 gỗ để click cung 2 áo. Chưa kể phải lên chặt gỗ, giáp cho cung, bánh xe. Vì vậy đi theo hướng này cần xây E có chiến thuật bo nhà ngay từ đầu. Chủ động kín nhà để phòng thủ thời điểm đầu. Sau khi chống được 2-3 turn quân thì sẽ rất khỏe. Khi tụ được một lượng cung A đủ lớn thì bất khả xâm phạm. Thông thường các cao thủ sẽ đánh 25-27 dân. Có thể xây BP thủ hù nếu gặp quân chém hay lạc đà.")
                    .attack("Ép đời sớm đánh chém là một bài dành cho thế tấn công. Trong trường hợp lên cung, khi tụ được 3-4 lượt xin quân là có thể đẩy nhà đối phương. Lợi thế cung A bắn xa, tốc độ bắn nhanh sẽ giúp người chơi nắm thế cửa trên. Ở phía đối diện khi chống cung A, mình thường phải xin thêm cẩu đá, hoặc phải thật trâu quân để lấy số lượng áp đảo chất lượng. Nên kết hợp việc điều chém hoặc cung chạy ngay làm giảm sát thương đồng thời phân tán cung A ra nhiều hướng cho dễ đánh. Trong đời 3 khi đã lên cung A 2 áo, rất ít loại quân đủ sức chống lại. Với cung tuyển Hittite +Damage hoặc Egyptian đầu máu 106 HP số lượng đông hơn thì còn có cửa.")
                    .build();

            List prosList10 = new ArrayList();
            prosList10.add("+25% tốc độ di chuyển cho Lạc Đà Palmyran. Đây là loại quân được game thủ miêu tả là thần gió chạy chân không chạm đất.");
            prosList10.add("+25% tốc độ làm việc của Nông dân và + 1 Giáp.");
            prosList10.add("+50% tốc độ ăn quả.");
            prosList10.add("100% thuế giao dịch. Tức là bơm đồ cho đồng đội không mất phí.");
            prosList10.add("Có bánh xe, cung R, cung A có lửa và cẩu đá to.");
            List consList10 = new ArrayList();
            consList10.add("Giá mua nông dân rất đắt. Tốn 75 thực/1 phu thay vì 50 như các quân AOE khác.");
            Empire empire10 = Empire.builder()
                    .name("Palmyran ")
                    .description("Palmyran là một nước tách ra từ đế chế La Mã để trở thành một quốc gia tự do, tồn tại từ năm 260 đến 273 trước Công Nguyên. Nơi đây chính là ốc đảo dừng chân lý tưởng của các đoàn lữ hành khi đi qua sa mạc Syria trên con đường tơ lụa nối liền từ Trung Quốc sang Ấn Độ. Hoàng đế Valerianus cai trị vương quốc của mình có thời kỳ phát triển thịnh vượng nhưng sau đó bị bắt giữ và giam cầm đến chết. Hoàng hậu Septimia Zenobia lên nắm quyền thay con để xây dựng đất nước và chỉ huy các cuộc chiến tranh chống xâm lược. Mình rất thích một câu nói của bà: “I’m a queen, and as long as I live I will reign” – Tức là, Tôi là một Nữ Hoàng, miễn là còn sống tôi sẽ trị vì.")
                    .prosList(prosList10)
                    .consList(prosList10)
                    .upLevel("Dân Palmyran làm thực rất nhanh, chỉ cần 5 dân ăn quả là đủ sóc dân. Tốc độ khai thác gỗ, an hươu đều nhanh hơn 25% nên nếu dò thấy quả phụ sớm sẽ lên đời rất nhanh. Ngược lại do dân tốn nhiều thực nên bài nghèo sẽ rất nghiệt. Với những người mới chơi thì đây là một loại quân khó và thường lên đời rất muộn. Thông thường bài giàu game thủ thường chỉ chơi với 16-17 dân chém sớm hoặc chỉ chơi 18 dân. Khi lên đời 3 nên xây ruộng chắc nhà. Đặc biệt dân Palmyran 2 dân làm 1 ruộng nhưng lượng thực dồn lên vẫn ổn.")
                    .defense("Với bài nghèo không lên đời sớm hơn đối thủ có thể lên đời kết hợp ăn hoang xây hù thủ nhà. Với số lượng ít hơn nhưng chất lượng hơn hẳn nên nông dân Pal phát triển không thua kém bất kỳ loại dân nào. Sau khi phòng thủ thành công, vì là quân có bánh xe, có ngựa R, cung A, xọc đơn nên bạn có rất nhiều lựa chọn tùy vào tình hình và thế trận.")
                    .attack("Là một trong số quân có lợi thế về lên đời, nên trong tay các cao thủ Palmy thường lên đời sớm và chủ động tấn công ngay từ đầu. Với lạc đà chạy không chạm đất bạn dễ dàng tìm nhà đối thủ và truy sát nông dân. Khi đối đầu với Palmyran đối phương thường thủ hù để khắc chế lạc đà. Khi gặp trường hợp này cần nhanh chóng nâng cấp bánh xe để xin 1 vài cung R bắn phù thủy. Trong team 4-4 Pal thường là quân chém sớm thời điểm đầu gây đột biến, về sau có thể phát triển lên 4 chơi horse thần hoặc đạp đôi. Một chiến thuật khác là vào nhà đồng đội bảo kê xây ruộng ăn thực trở thành 1 cái máy bơm để tận dụng lợi thế giao dịch không mất phí qua nhà chợ BM.")
                    .build();

            List prosList11 = new ArrayList();
            prosList11.add("+30% sản lượng khai thác cho nông dân ăn thịt voi và hươu. Cụ thể dân ăn được 13 thịt mỗi lần di chuyển. Lên đời sớm.");
            prosList11.add("+30% tốc độ di chuyển cho voi. Voi Điên Persian chạy nhanh như ngựa áp sát đối thủ nhanh để gây ra sát thương.");
            prosList11.add("Có cung A và Horse Thần lửa, có đầu máu.");
            List consList11 = new ArrayList();
            consList11.add("-30% sản lượng nông nghiệp từ làm ruộng.");
            consList11.add("Không có bánh xe nên dân di chuyển rất chậm, gặp khó khăn khi đồ ăn ở xa nhà, khó phát triển lâu dài và dễ bị quân địch tiêu diệt.");
            consList11.add("Khai thác gỗ không hiệu quả do chỉ có thể nâng cấp 1 lần.");
            Empire empire11 = Empire.builder()
                    .name("Persian")
                    .description("Persian là một nước tách ra từ đế chế La Mã để trở thành một quốc gia tự do, tồn tại từ năm 260 đến 273 trước Công Nguyên. Nơi đây chính là ốc đảo dừng chân lý tưởng của các đoàn lữ hành khi đi qua sa mạc Syria trên con đường tơ lụa nối liền từ Trung Quốc sang Ấn Độ. Hoàng đế Valerianus cai trị vương quốc của mình có thời kỳ phát triển thịnh vượng nhưng sau đó bị bắt giữ và giam cầm đến chết. Hoàng hậu Septimia Zenobia lên nắm quyền thay con để xây dựng đất nước và chỉ huy các cuộc chiến tranh chống xâm lược. Mình rất thích một câu nói của bà: “I’m a queen, and as long as I live I will reign” – Tức là, Tôi là một Nữ Hoàng, miễn là còn sống tôi sẽ trị vì.")
                    .prosList(prosList11)
                    .consList(consList11)
                    .upLevel("Nông dân Per ăn thịt động vật (Gồm hươu và voi) nhanh hơn các loại quân khác (13 thịt) nên thực dồn lên rất nhanh. Cần chú ý lùa hươu và câu voi sớm, ăn quả phụ sau. Đây là một lợi thế gây đột biến giúp game thủ lên đời sớm hơn rất nhiều, có lợi thế xin dò và chém sớm ngay từ thời điểm đầu. Nếu tận dụng tốt ưu điểm này bạn có thể hạ đối thủ trong vòng 1 nốt nhạc. Hầu hết các cao thủ đều yêu thích khi được cầm quân này. Càng đánh về lâu dài càng gặp bất lợi do dân đi chậm, gặp khó khăn khi di chuyển ăn hoang. Bị đối phương phát hiện thì xác định chết dân. Nếu làm xây ruộng chắc nhà thì sản lượng thu hoạch không cao.")
                    .defense("Khi cầm Persi đánh thủ thì thường sẽ đóng BP thủ hù và kín nhà lên cung A. Mặc dù vậy nếu có 1 đạo khoảng 5-6 dân bên ngoài đi ăn hoang thì lực sẽ rất khỏe, thế trận sẽ dễ đánh hơn rất nhiều. Là quân không có bánh xe nên kín nhà hoặc bo nhỏ là điều hết sức quan trọng. Nếu để lọt nhà thì những thằng dân sẽ nhanh chóng anh dũng nằm xuống hy sinh vì khó có cơ hội chạy thoát được. Khi gặp những quân vàng như: Greek, Catha, Choson mình hay chơi trâu phù cũng là một lựa chọn hay.")
                    .attack("Với lợi thế ép đời siêu sớm. Per si và Palmyran là 2 loại quân có đột biến lên đời nhanh nhất. Là một tay cầm chém chuyên nghiệp bạn sẽ thích xây BL xin dò, chơi chém hơn. Tấn công phủ đầu đánh chết đối thủ ngay từ những turn quân đầu tiên. Chỉ xin 23 đến 24 dân để tiết kiệm thực lên đời. Với map nhiều hươu voi một số game thủ còn đánh với 22 dân. Vì lượng thực dồn lên rất nhanh đủ để bạn có thể click đời sớm. Chú ý không nên để chết dò, vì mục đích tìm dân đối phương tốt hơn. Trong team 4-4 Persian gây đột biến thời điểm đầu, khi lên đời 4 hoàn toàn có thể chuyển cung đánh Horse hoặc Voi Điên rất hiệu quả.")
                    .build();

            List prosList12 = new ArrayList();
            prosList12.add("+30% năng suất nông dân khai thác gỗ. Ngay từ đời 1 nông dân có thể chặt 13 gỗ mỗi lần. Nên tiết kiệm được số dân để đi ăn thực.");
            prosList12.add("-25% giảm giá tất cả các đơn vị voi vì vậy chơi voi Phoenician rất rẻ mà chất lượng.");
            prosList12.add("+65% sát thương hỏa hoạn cho thuyền khi thi đấu trên map biển. Rất mạnh.");
            prosList12.add("Có bánh xe, cung R, xọc đơn, lạc đà, cung A đời 3. Có đạp đôi đời 4.");
            List consList12 = new ArrayList();
            consList12.add("Không có pháo thần.");
            consList12.add("Không có ngựa Horse");
            consList12.add("Cả voi và song mã đều yếu so với các quân AOE khác.");
            Empire empire12 = Empire.builder()
                    .name("Phoenician")
                    .description("Phoenician nằm ở phía bắc vùng Canaan cổ đại tồn tại từ năm 1,500 đến 300 trước Công Nguyên. Nền văn minh này phát triển thịnh vượng chủ yếu dựa vào các hoạt động sản xuất nông nghiệp, đánh bắt thủy hải sản và giao thương hàng hóa trên khắp địa phận Địa Trung Hải. Đây là xã hội cấp nhà nước đầu tiên trên thế giới phát minh và sử bảng chữ cái rỗng rãi, được coi là cái nôi cho sự hình thành chữ viết sau này của nhiều quốc gia khác.")
                    .prosList(prosList12)
                    .consList(consList12)
                    .upLevel("Nông dân Phoenician chặt gỗ nhanh nên thông thường chỉ cần 4-5 dân/1 BS là đủ. Vì vậy dồn dân ăn thịt nhiều hơn sẽ có lợi thế lên đời sớm hơn đối phương. Ngoài ra đặc điểm này khiến cho người cầm quân Phô rất dễ chơi. Có thể xây BA, BL, đắp ruộng thoải mái. Đánh về lâu dài thì có lợi thế phát triển vượt trội. Trong map solo và đánh team quân Phonecian đều được game thủ yêu thích.")
                    .defense("Nắm trong tay ưu điểm lên đời sớm, phát triển nhanh người chơi có thể lựa chọn cách chơi tấn công cống hiến hoặc trâu dân, đông quân thủ nhà. Chỉ thủ là đụ. Tuy cả cung R và ngựa giấy không có điểm gì nổi bật, bù lại bạn dễ dàng sóc đều 5 nhà quân lấy số lượng bù chất lượng để thi đấu sòng phẳng với đối thủ. Nếu gặp những chém tuyển như Perian, Yamoto có thể kín nhà bo nhỏ thủ hù. Khi gặp cung tuyển như Assyrian, Hittite, Egyptian nếu gặp bất lợi khi chơi cung R có thể chuyển cung A cũng là một cách hay. Nếu thừa tài nguyên hoàn toàn có thể hỗ trợ đồng đội. Rất nhiều trận đánh Phoenician trở thành cái máy bơm, bơm đồ cho đồng đội lên 4 nhanh chóng tạo ra nhiều đột biến và bất ngờ cho quân địch trong đế chế.")
                    .attack("Có rất nhiều lựa chọn, vì đây là quân khá đa dạng về lính trong AOE. Có thể chơi lạc đà chém sớm thời điểm đầu rồi lên bánh xe chuyển cung R hoặc xọc đơn. Tuy nhiên để chắc bài, dù có đánh theo thế tấn công người chơi vẫn muốn lên bánh xe ngay từ đầu. Lên đời sớm sẽ là lợi thế để đẩy turn quân đầu tiên sớm dò nhà và quấy nhà đối phương. Chắc chắn khi cầm Phoenician người chơi thường kết hợp sóc thêm dân để đua phát triển. Với 2-3 BS là đủ cho game thủ cơ cấu thực gỗ, xây nhà, đắp ruộng đề huề. Đây là loại quân phù hợp với người mới chơi hoặc cho những tay cầm chủ lực trong team. Lên đời 4 có thể chơi đạp đôi đẩy nhà quản bản đồ hoặc chơi voi bắn để tận dụng lợi thế giá rẻ chống horse rất hiệu quả.")
                    .build();

            List prosList13 = new ArrayList();
            prosList13.add("-15% giá xây các loại công trình. Nên việc xây nhà điều kiện, các đơn vị làm ăn rất rẻ, tốn ít gỗ, cần ít nông dân khai thác.");
            prosList13.add("-50% giá xây chòi canh.");
            prosList13.add("+30% tốc độ đánh cho BB. Đây có lẽ là loại BB thần mạnh nhất đế chế, hơn cả Z điên Choson.");
            prosList13.add("Đạp đôi đời 4 có thể lên Max công nghệ: Công 9+7, giáp 2+6, đầu máu. Chỉ kém song mã của Egyptian.");
            prosList13.add("Có bắn chặn cho cẩu đá và pháo bẹt thần.");
            List consList13 = new ArrayList();
            consList13.add("Không cung R, Horse trong nhà quân BA.");
            consList13.add("Không có lạc đà và voi.");
            consList13.add("Không có lửa.");
            Empire empire13 = Empire.builder()
                    .name("Roman")
                    .description("Roman hay có tên gọi khác là Đế Quốc La Mã tồn tại ở thế kỷ thứ nhất đến thế kỷ thứ 5 TCN. Vị vua đầu tiên trị vì là Augustus kéo dài suốt 40 năm lịch sử được xem là thời đại hoàng kim phát triển rực rỡ với nhiều chiến công, thành tựu. Sụ đoàn kết trong đất nước mang lại cuộc sống ấm no cho người dân, kinh tế, văn hóa, tôn giáo, quân sự được đầu tư phát triển. Tiếp theo giai đoạn này là sự cai trị của các vị hoàng đế khác, những cuộc nội chiến, xâm lược liên túc diễn ra khiến nhà nước dần dần bị suy thoái.")
                    .prosList(prosList13)
                    .consList(consList13)
                    .upLevel("Dân Roman không có lợi thế gì so với các loại quân trong đế chế khác nhưng vì giá xây dựng nhà cửa rẻ nên có thể xem như lợi gỗ. Vì vậy khi cầm quân này chúng ta chỉ cần 4-5 dân ăn gỗ là đủ. Vì vậy có thể cắt 1-2 dân ăn quả giúp nhanh chóng đạt được lượng thực cần thiết để đi dò. Với cách đánh thông thường người chơi sẽ điều 6 dân đầu làm quả. Dân thứ 7 đi dò đồ ăn và địa thế nhà, dân thứ 8 chặt gỗ. Nhưng riêng với Roman bạn có thể dùng dân thứ 7 và 8 đi mở bản đồ. Dân thứ 9 chặt gỗ, dân thứ 10 đóng BE vì thời điểm đầu chúng ta có đủ lượng gỗ để xây đủ 3 nhà dân mà không cần phải chặt gỗ ngay. Đây là một lợi thế và cách đánh mà không phải ai cũng biết. Trong tay các cao thủ, roman lên đời rất sớm không hơn kém nhiều so với các loại dân tuyển khác như Persian, Palmyran, Phoenician …")
                    .defense("Nếu cầm roman chơi thủ có thể chơi chém kẹp hù. Hoặc một chiến thuật khác là kín nhà, trâu dân, nâng bánh xe, đóng 4 BL đánh như chơi cung R. Xọc đơn khá yếu và bất lợi khi thi đấu với lạc đà hay ngựa chém, bù lại giá rẻ hơn nên có thể lấy số lượng áp đảo. Và lưu ý cần nâng cấp công + giáp cho ngựa. Thế trận lâu dài có thể bố trí tách 1 dân ra ăn vàng để lên cả đầu máu nữa. Roman tương đối dễ chơi giống như Phô vì dễ dàng xây nhà, đắp ruộng phù hợp với người mới hoặc rất mạnh khi trong tay cao thủ.")
                    .attack("Mặc dù là quân có bánh xe nhưng với thế trận tấn công nên tận dụng khả năng lên đời sớm và đánh chém ngay thời điểm ban đầu. Lúc này chỉ nên xin 23-24 dân, sau khi lên đời đóng 2 BL và xóc đều ngựa chém. Có thể kẹp phù thủy công hay để ở nhà thủ. Nếu đối phương bo nhà hay cũng thủ hù thì chủ động lên bánh xe xin xọc đơn khắc chế lại. Trong trường hợp cần thiết có thể dâng thêm dân đóng BA, BK mua cẩu đá công nhà. Dân Roman chỉ cần nâng 1 chặt gỗ cũng đủ cho bạn triển khai nhiều chiến thuật theo ý đồ của mình rất lợi hại. Trong đánh team, Roman là quân dễ phát triển tay to và khi lên đời 4 chơi đạp đôi cũng rất hiệu quả. Khi nâng cấp full các công nghệ song mã Roman chỉ kém đạp đôi Egyptian ở máu. Ngoài ra bạn nên biết rằng chính BB thần Roman (Z điên) mới là mạnh nhất AOE, mạnh hơn cả BB Choson. Tuy nhiên không cơ động và hiệu quả như đạp đôi nên ít được các game thủ sử dụng thường xuyên. Một số người chơi sử dụng bài dị chơi BB ngay từ đời 3 để khắc chế những loại quân đánh cung A 1 áo (Vì có chiêng đồng). Tương tự như Phoenician, Roman có thể phát triển trong nhà đồng đội để bơm đồ hỗ trợ cũng là một bài hay thường được áp dụng.")
                    .build();

            List prosList14 = new ArrayList();
            prosList14.add("Giá mua dân rẻ nhất trong game. Chỉ 35 thịt thay vì 50 so với các loại quân trong AOE khác.");
            prosList14.add("x2 Máu cho tường thành. Trong luật chơi có thành chòi của Trung Quốc thì Shang là loại quân rất có lợi thế.");
            prosList14.add("Đầy đủ nhiều loại lính: Cung R, xọc đơn, ngựa chém, lạc đà, cung A, Horse thần, pháo thần, đạp đôi…");
            List consList14 = new ArrayList();
            consList14.add("Không có lửa và bắn chặn trong nhà công nghệ BC.");
            Empire empire14 = Empire.builder()
                    .name("Shang")
                    .description("Shang là đế chế có vị trí địa lý nằm ở phía đông bắc của Trung Quốc ngày nay. Tồn tại vào năm 1,600 đến 1,027 trước Công Nguyên và được gọi là triều đại nhà Thương. Nó viết tiếp lịch sử sau nhà Hạ và nhà Chu với vị vua đầu tiên cai trị đất nước là Thành Thang và kết thúc bở vua Trụ sau 30 đời. Về mặt quân sự nhà Thương thường xuyên phải đối mặt với những cuộc xâm lăng từ các nước láng giềng xung quanh đồng thời cũng dẫn quân đi chinh phạt, xâm lược cướp bóc nước khác. Đến đời thứ 30, dưới sụ cai trị tàn ác bạo ngược của mình Trụ Vương khiến chu hầu và đông đảo bộ phân nhân dân phẫn nộ. Cuối cùng dẫn đến kết cục phiến quân nổi dậy tiêu diệt triều đình để mở ra một trang sử mới.")
                    .prosList(prosList14)
                    .consList(consList14)
                    .upLevel("Bên cạnh Persian ăn thịt nhanh, Palmyran ăn quả nhanh thì Shang là một loại quân có lợi thế ép đời sớm và ổn định nhất. Với những loại quân khác người chơi cần có hươu, voi, quả và phụ thuộc nhiều vào thế bài, đồ ăn. Ngược lại với Shang, do dân rẻ nên thời điểm đầu chỉ cần 4 dân ăn thực là đủ xin đều dân. ít khi gặp tình trạng chậm dân hay bài nghèo. Công thức lên đời sớm bạn điều 4 dân đầu đi ăn quả, dân thứ 5,6 dò nhà. Các dân tiếp theo tập trung chặc gỗ để nhanh chóng thiết kế BS. Đây là cách đánh cơ bản nhất, trên thực tế game thủ thường tìm quanh nhà huơu hoặc voi lùa về ăn trước để đóng BS trước. Với cách đánh này bạn sẽ có nhiều gỗ và phát triển tốt hơn.")
                    .defense("Shang là loại quân lên đời sớm. Tùy tư duy và sở thích từng người có thể lựa chọn cách chơi công phũ phàng hoặc phòng thủ đỉnh cao. Khi gặp những loại quân thường không có lợi thế, có thể ép đời sớm chơi ngựa chém hoặc lạc đà thời điểm đầu rồi chuyển cung R, xọc đơn. Ngược lại khi gặp Per, Pal, Yamato, Hit, Assy bạn sẽ gặp bất lợi về chất lượng quân. Vì thế có thể thủ hù, lên bánh xe đánh 5 BA đánh cung R, ngựa đơn hoặc cung A. Trong team 4-4 Shang là loại quân có khả năng gây đột biến thời điểm đầu và phát triển tay to lâu dài. Khi lên 4 thông thường người chơi sẽ lên đạp đôi chơi song mã. Vì horse thần không có lửa nên tính hiệu quả không cao.")
                    .attack("Ép dân, ép đồ cao thủ có click đời ở cuối phút thứ 6 hoặc đầu phút thứ 7 để lên đời 2, phút thứ 9 để lên đời 3. Vì vậy bạn tạo ra 1 khoảng cách khá xa so với đối phương nên có thể chơi lạc đá hoặc ngựa chém tìm dân ngay từ thời điểm ban đầu. Nếu gặp gà bạn có thể giải quyết ván đấu chóng vánh trong vài phút. Tuy nhiên khi gặp những người ngang cơ chắc chắn khi đối đầu với Shang họ sẽ bo nhà, nâng cấp bánh xe để chạy dân hoặc có những chiến thuật khắc chế. Vì vậy game thủ cần linh hoạt xử lý và đưa ra những miếng đánh đáp trả cho phù hợp nhất. Khi đánh chém gặp thủ hù phải nhanh chóng lên bánh xe, xin 1-2 cung R hỗ trợ bắn phù thủy là đủ. Gặp đối phương bo kín nhà có thể đem 2 dân đang BA công cung T hoặc xin luôn cẩu đá phá nhà. Trong team 4-4 có thể theo hướng phát triển tay to hoặc bơm đồ cho đồng đội.")
                    .build();

            List prosList15 = new ArrayList();
            prosList15.add("+50% tốc đố tấn công cho cẩu đá.");
            prosList15.add("+15 HP cho nông dân. Tức là 25+15=40 máu. Vì vậy dân đi dò đồ không sợ sư tử dọc đường. Nếu ở trên dốc, 1 nông dân Sumerian có thể giết 2 sư tử là chuyện bình thường mà các loại dân khác không thể nào làm được.");
            prosList15.add("Có Horse, Xọc Xiên Thần, Đạp Đôi.");
            prosList15.add("Có bánh xe, đầu máu, lửa và bắn chặn.");
            List consList15 = new ArrayList();
            consList15.add("Không có cung A, pháo bẹt Ballista.");
            consList15.add("Không có voi.");
            consList15.add("Không có quân đời 3 gây đột biến.");
            Empire empire15 = Empire.builder()
                    .name("Sumerian")
                    .description("Sumerian là đế chế thuộc đất nước Irag ngày nay ở phía nam Lưỡng Hà. Đây chính là tộc người có nhiều đóng góp to lớn cho nền văn hóa của nhân loại. Người Sumer đã từ bỏ lối sống nguyên thủy thường xuyên di chuyển đi săn bắt hái lượm để có một cuộc sống ổn định. Chính vì thế họ đã sớm phát triển thủy lợi, nuôi trồng tập trung và có sự phân công lao động, quản lý nhân sự chuyên nghiệp từ lâu đời. Về mặt quân sự, trải qua nhiều cuộc giao tranh trong 2,000 năm chiều dài lịch sử đã giúp phát triển kỹ thuật và công nghệ chiến tranh lên một tầm cao mới. Lính bộ binh thường mang giáo làm vũ khí chiến đấu, đầu đội mũ trụ bằng đồng bảo vệ và mang khiên chắn bằng da hoặc liễu gai. Quân đội được chỉ huy rèn luyện theo khuôn khổ kỷ luật nghiêm ngặt, đào tạo ra những chiến binh có trình độ cao.")
                    .prosList(prosList15)
                    .consList(consList15)
                    .upLevel("Nông dân đời 1 và đời 2 không có gì lợi thế trong khả năng lên đời nên cách đánh bình thường giống các loại quân khác. Có một truyền thuyết được các game thủ truyền miệng nhau là xung quanh nhà Sumerian thường sẽ có đôi voi nên bạn hãy cố tìm cho ra chúng. Do nông dân có 40 máu nên trong quá trình dò nhà tìm đô ăn giảm tỷ lệ bị chết dân. Tuy nhiên đặc điểm này không đem lại quá nhiều điểm khác biệt.")
                    .defense("Khả năng chống ngựa dò thời điểm đầu của dân Sumer là tốt nhất. Với những con dò chưa có giáp thì nông dân sẵn sàng lao vào làm thịt. Kể cả ngựa chém hay lạc đà cũng không thể dễ dàng tiêu diệt. Khi có biến người chơi dễ dàng cho nông dân của mình tẩu thoát. Đây là loại quân có cả cung R, xọc đơn và phù thủy. Đầy đủ các loại lính để bạn thủ nhà trong đời 3. Bạn có thể chơi chay cung R hoặc kết hợp cung kẹp xọc đơn để tăng thêm sức mạnh khi đối đầu với những loại quân tuyển khác. Nếu đối đầu với Assyrian, Hittite, Egyptian hay kể cả cung A 2 áo của Minoan đời 3, nhiều người chơi sẽ đánh cả cẩu đá. Bởi vì pháo bắn đá của Sumer được tăng 50% tốc độ bắn nên vô cùng chất lượng, chắc chắn sẽ mang lại nhiều hiệu quả khi gặp bất lợi đấu cung. Sau khi lên đời cố gắng đắp ruộng chơi chắc nhà để tận dụng khả năng phát triển nông nghiệp của loại quân này.")
                    .attack("Là một quân cơ bản và cũng tương đối nhiều lựa chọn trong game đế chế. Người chơi có thể chơi lạc đà thời điểm đầu. Sau đó nâng bánh xe chơi cung R, kẹp ngựa đơn, kẹp cẩu đá … để tấn công đối thủ. Chiến thuật sẽ phụ thuộc vào người chơi cũng như thế bài, thế trận cụ thể trong từng trận đấu. Nếu đánh chém bạn chú ý giữ dò để tìm dân cũng như các đơn vị làm ăn. Ngược lại nếu đánh cung cần chú ý điều quân và tìm vị trí đứng trên dốc được cộng damage khi thi đấu. Trong team 4-4 Sumerian cuối trận có thể lên song mã quản bản đồ. Chơi pháo bắn đá kết hợp với đồng đội để phá nát đội hình đối phương. Cẩu đá thần Sumer bắn rất nhanh, đầy đủ công nghệ, không hề ngán bất kỳ loại cẩu đá nào trong AOE.")
                    .build();

            List prosList16 = new ArrayList();
            prosList16.add("+25% Tốc Độ Di Chuyển cho nông dân nên hiệu quả làm việc rất nhanh và linh hoạt. Dễ dàng chạy thoát khi bị quân địch truy đuổi hoặc làm nhiệm vụ đảo khi giao tranh.");
            prosList16.add("-25% giảm giá cho ngựa dò, ngựa chém và horse. Có thể lên horse thần.");
            prosList16.add("Có bánh xe, đầu máu, lửa, bắn chặn, cung A 2 áo và xọc xiên thần.");
            List consList16 = new ArrayList();
            consList16.add("Không có cung R chống phù thủy, đạp đôi, voi.");
            consList16.add("Không có cẩu đá to.");
            consList16.add("Là loại quân phụ thuộc vào vàng.");
            Empire empire16 = Empire.builder()
                    .name("Yamato")
                    .description("Yamato là một triều đại của đất nước Nhật Bản thuộc Châu Á tồn tại từ thế kỷ thứ 4 kéo dài đến tận thế kỷ thứ 7. Nổi bật trong giai đoạn này là Thánh Đức Thái Tử – người đã có công lớn trong việc truyền bá đạo Phật rộng rãi, cải cách bộ máy hành chính và ban hành các điều luật. Nhật Bản có nền nông nghiệp phát triển và các hạm đội biển vô cùng mạnh mẽ nổi tiếng thế giới. Về mặt quân sự họ theo đuổi đường lối giảm số lượng và tăng chất lượng. Không ngừng mở rộng, nâng cấp, trang bị vũ khí hiện đại tăng cường khả năng phòng vệ lẫn tấn công.")
                    .prosList(prosList16)
                    .consList(consList16)
                    .upLevel("Với lợi thế nông dân chạy nhanh người chơi dễ dàng dò đồ, di chuyển đến địa điểm làm ăn nên có ưu điểm về lên đời. Hơn nữa khi bị quân địch truy sát nông dân cũng dễ dàng tẩu thoát hơn các loại quân AOE khác. Tuy nhiên cũng giống như Assyrian, đôi khi bạn sẽ gặp khó khăn trong việc câu voi ở vị trí xa vì dễ bị quay đầu hoặc chết giữa đường. Khi điều khiển phu Yamato cần có thao tác tốt, kỹ năng thuần thục và sử dụng thêm phím S để hãm dân lại. Lợi thế ép đời sớm là khá quan trọng trong đế chế.")
                    .defense("Yamato là quân vàng, bạn có thể đào thêm vàng để chơi phù thủy thủ nhà. Đây cũng là quân có thể nâng cấp lên cung A 2 áo, vì vậy tùy thế bài có thể lên thẳng cung tạo bất ngờ cho đối thủ. Nếu có đủ lực lưu ý nâng cấp thêm bánh xe để phát triển linh hoạt hơn. Khi đã lên thành công cung A 2 áo thì thế trận sẽ tươi hơn rất nhiều. Trong team 4-4 cũng rất dễ phát triển tay to để bật 4 chơi Horse thần Yamato. Đây là loại Horse rất rẻ nên được nhiều game thủ yêu thích sử dụng. Với những kích hót số lượng lớn có đầu máu, lửa và bắn chặn chắc chắn sẽ khiến đối thủ phải e sợ. Khả năng quản bản đồ của hot là cực kỳ tốt, có nhiều ý nghĩa quyết định đến cục diện trận đấu.")
                    .attack("Ngược lại với thế trận phòng thủ, đa số người chơi khi được cầm Yamato đều sẽ cố gắng lên đời sớm và chơi ngựa chém (ngựa C). Lý do ở đây bởi ngựa dò chỉ 75 thực thay vì 100 như bình thường. Giá ngựa chém rẻ hơn 25% nên dễ dàng sóc đều 2 BL, thậm chí là 3 nhà quân. Đây là lợi thế mà không ai muốn bỏ qua. Trong 1 thời gian ngắn bạn dễ dàng tụ được một số lượng ngựa chém lớn để chém bay nhà đối phương. Tuy nhiên ở đời 3 lạc đà sẽ khắc chế ngựa chém, nên tùy tình hình có thể kẹp thêm phù thủy hoặc chuyển cung A. Ngựa chém Yamato mạnh nhất đế chế vì có thể nâng cấp lên thần và max công nghệ. Nhưng rất tốn lực mà ở đời 4 chơi Horse Thần linh động và hiệu quả hơn nên ít người chơi chém thần.")
                    .build();

            empireList.add(empire1);
            empireList.add(empire2);
            empireList.add(empire3);
            empireList.add(empire4);
            empireList.add(empire5);
            empireList.add(empire6);
            empireList.add(empire7);
            empireList.add(empire8);
            empireList.add(empire9);
            empireList.add(empire10);
            empireList.add(empire11);
            empireList.add(empire12);
            empireList.add(empire13);
            empireList.add(empire14);
            empireList.add(empire15);
            empireList.add(empire16);

            return empireList;
        }

    }
}
