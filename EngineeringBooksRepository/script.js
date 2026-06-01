const subjects = {
    'cse': {
        'sem1': ['Applied Mathematics 1', 'Python programming','OOPS using Cpp','Web Development','Basic Electical Engg','Engineering Graphics'],
        'sem2': ['Applied Mathematics 2', 'Applied Physics', 'Manufacturing Processes', 'Basic Electronics Engg','Computer Programming'],
        'sem3': ['Python Programming','Data Structures','Computer Networks','Computer System Arch.','Discrete Mathematical Structures'],
        'sem4': ['Algo. Analysis & Design','Operating Systems','DBMS','Software Engg','MPOB'],
        'sem5': ['Java Programming','Network Security & Computer Forensics','Artificial Intelligence','Theory of Computation'],
        'sem6': ['Mobile App. Dev.','Machine Learning','Computer Graphics','Compiler Design','Iot & Applications'],
        'sem7': ['Advanced Web Development','Data Mining & Warehousing','Digital Image Processing']
    },
    'ece': {
        'sem1': ['Applied Mathematics 1', 'Applied Physics', 'Manufacturing Processes', 'Basic Electronics Engg','Computer Programming'],
        'sem2': ['Applied Mathematics 2', 'Python programming','OOPS using Cpp','Basic Electical Engg','Engineering Graphics'],
        'sem3': ['Electronic Devices','MPOB','OOPS using Cpp','Electrical & Electronic Instrumentation'],
        'sem4': ['ADCS','Antenna & Wave Propagation','Digital Electronic Circuits','Circuit Theory','Signals & Systems'],
        'sem5': ['Microprocessor & App.','Digital System Design','Linear Integrated Circiuts','Control Engineering','Data Structures & Algorithms'],
        'sem6': ['Digital Signal Processing','Artificial Intelligence','DBMS','Microelectronics'],
        'sem7': ['Microwave Engineering','Wireless & Mobile Communications','Computer Networks','Cryptography & Network Security','Digital Image Processing']
    },
    'ecm': {
        'sem1': ['Applied Mathematics 1', 'Applied Physics', 'Manufacturing Processes', 'Basic Electronics Engg','Engineering Graphics'],
        'sem2': ['Applied Mathematics 2', 'Python programming','OOPS using Cpp','Basic Electical Engg','Computer Programming'],
        'sem3': ['MPOB','OOPS using Cpp','Discrete Mathematics','Operating System','Computer System Architecture'],
        'sem4': ['Digital Electronic Circuits','Circuit Theory','Signals & Systems','Web Development','Data Structures & Algorithms'],
        'sem5': ['ADCS','Mobile App. Dev.','Computer Networks','Microprocessor & App.','Linear Integrated Circiuts'],
        'sem6': ['Iot & Applications','Digital Image Processing','Artificial Intelligence','Wireless & Mobile Communications','DBMS'],
        'sem7': ['Digital Signal Processing','Cryptography & Network Security','Digital System Design','Big data & Cloud Computing','Microwave Engineering']
    },
    'mech':{
        'sem1':['Applied Mathematics 1', 'Applied Physics', 'Manufacturing Processes', 'Basic Electronics Engg','Computer Programming'],
        'sem2': ['Applied Mathematics 2', 'Python programming','OOPS using Cpp','Basic Electical Engg','Engineering Graphics'],
        'sem3': ['Numerical Methods & Applications','Operations Research','Basic Thermodynamics','Strength of Materials','Manufacturing Technology','Machine Drawing'],
        'sem4': ['Theory of Machines','Fluid Mechanics','Applied Thermodynamics','Machine Drawing 1'],
        'sem5': ['Web Technologies','Machine Design 2','Dynamics of Machines','Heat & Mass Transfer','Industrial Engineering'],
        'sem6': ['Computer Aided Design','Machining Science','Mechanical Vibrations','Welding Technology','Machine Tool Design'],
        'sem7': ['Fluid Machines','Automobile Engineering','IC Engines','Metal Forming','Heat Exchangers','Power Plant Engineering']
    },
    'civil':{
        'sem1':['Applied Mathematics 1', 'Applied Physics', 'Manufacturing Processes', 'Basic Electronics Engg','Computer Programming'],
        'sem2': ['Applied Mathematics 2', 'Python programming','OOPS using Cpp','Basic Electical Engg','Engineering Graphics'],
        'sem3': ['Building Materials','Fluid Mechanics','Building Construction','Hydrology & Dams','MPOB'],
        'sem4': ['Solid Mechanics','Transport Engineering 1','Concrete Technology','Drug Abuse'],
        'sem5': ['Transportaion Engineering 2','Structure Analysis 1','Water Supply Engineering','Estimation & Costing','Irrigation Engineering 1','Steel Structure Design'],
        'sem6': ['Geo Technology 1','Steel Structure Design','Structure Anaysis 2','Waste Water Engineering','Foundation Engineering'],
        'sem7': ['Geo Technology 2','Structure Analysis','Railway & Airport','Advance Traffic Engineering','Air Quality Management','Operations Research']
    }
};

const books = {
    'Applied Mathematics 1': ['pdfs/Advanced Engineering Mathematics Kreyszig E. .pdf', 'pdfs/Higher Engineering Mathematics BS Grewal.pdf','pdfs/','pdfs/Advanced Engneering Maths-RK Jain SRK Iyenger.pdf','pdfs/Advanced Engineering Mathematics H.k.dass.pdf'],
    'Computer Programming':['pdfs/Let us c - yashwantkanetkar.pdf','pdfs/computer_fundamental_complete-Pradeepp K sinha.pdf','pdfs/Progarmming in C-balaguruswamy.pdf','pdfs/The_C_Programming_Language_(2nd_Edition_Ritchie_Kernighan).pdf'],
    'Python programming':['pdfs/Python for Data Analysis-William Mckinney.pdf','pdfs/SciPyNumPy-Eli Bresseert.pdf','pdfs/Learning Python-Mark Lutz 5th Edition.pdf'],
    'Computer System Architecture':['pdfs/Computer System Architecture M. Morris Mano.pdf'],
    'Applied Mathematics 2': ['pdfs/Advanced Engineering Mathematics Kreyszig E. .pdf', 'pdfs/Higher Engineering Mathematics BS Grewal.pdf','pdfs/','pdfs/Advanced Engneering Maths-RK Jain SRK Iyenger.pdf','pdfs/Advanced Engineering Mathematics H.k.dass.pdf'],
    'Engineering Graphics':['pdfs/Jolhe  Engineering Drawing With an Intro to AutoCADTata.pdf','pdfs/Engineering-Drawing-Basant Agrawal CM Agrawal.pdf','pdfs/Engineering Drawing by N.D. Bhatt.pdf'],
    'Fluid Mechanics':['pdfs/Fluid mechanics-Frank M. White.pdf','pdfs/Fluid-Mechanics-SK Som.pdf','pdfs/Intro to fluid mechanics- Fox & Mcdonald.pdf' ],
    'OOPS using Cpp':['pdfs/ObjectOrientedProgramminginC-Robert Lafore 4thEdition.pdf','pdfs/C++.Primer.Plus-Stephan Prata 6th.Edition.Oct.2011.pdf','pdfs/Balaguruswamy Object Oriented Programming With C++ Fourth Edition.pdf'],
    'Web Development':['pdfs/HTML5_for_Web_Designers.pdf','pdfs/head first html with css html-Elisabeth freeman eric freeman.pdf','pdfs/JavaScript-The-Missing-Manual-David Mcfarland.pdf','pdfs/JavaScript-The-Definitive-Guide-David Flanagan.pdf'],
    'DBMS':['pdfs/Fundamentals_of_Database_Systems_6th_Edition-1.pdf','pdfs/Database Management system-Prateek Bhatia,Kalayani Publishers','pdfs/An-Introduction-to-Database-Systems-Bipin-C.Desai.pdf'],
    'Digital Signal Processing':['pdfs/Digital Signal Processing_B. Somanathan Nair.pdf'],
    'Digital System Design': ['pdfs/Digital Design Principles And Practices - Wakerly.pdf', 'pdfs/Digital-systems-principles-and-applications-10th-edition-tocci-widmer.pdf','pdfs/DIGITAL PRINCIPLES AND APPLICATION BY LEACH & MALVINO.pdf'],
    'Cryptography & Network Security':['pdfs/Cryptography and network security William Stallings.pdf','pdfs/Baldwin R and Rivest. R. The Algorithms.pdf'],
    'Big data & Cloud Computing':['pdfs/Cloud Computing Nikos Antonopoulos Lee Gillam Springer.pdf','pdfs/Cloud Computing Principles and Paradigms.pdf','pdfs/Cloud Computing Bible.pdf',''],
    'Microwave Engineering':['pdfs/Computer-Aided Design of RF and Microwave Circuits and Systems.pdf','pdfs/Microwave and Radar by M Kulkarni.pdf','pdfs/Foundation of Microwave Engg R.E.Collin McGraw Hill.pdf','pdfs/Microwave devices and circuits by Samuel Liao.pdf','pdfs/Electronics&CommunicationSystem by George Kennedy.pdf'],
};

let currentStream = '';
let currentSemester = '';

function loadSemesters(stream) {
    currentStream = stream;
    history.pushState({ page: 'semester', stream: stream }, '', '#semester');
    document.getElementById('stream-selection').style.display = 'none';
    document.getElementById('semester-selection').style.display = 'block';
}

function loadSubjects(semester) {
    currentSemester = semester;
    history.pushState({ page: 'subject', semester: semester }, '', '#subject');
    document.getElementById('semester-selection').style.display = 'none';
    const subjectList = document.getElementById('subject-list');
    subjectList.innerHTML = '';

    if (subjects[currentStream] && subjects[currentStream][currentSemester]) {
        subjects[currentStream][currentSemester].forEach(subject => {
            const button = document.createElement('button');
            button.textContent = subject;
            button.onclick = () => loadBooks(subject);
            subjectList.appendChild(button);
        });
    }

    document.getElementById('subject-selection').style.display = 'block';
}


function loadBooks(subject) {
    history.pushState({ page: 'book', subject: subject }, '', '#books');
    document.getElementById('subject-selection').style.display = 'none';
    const bookList = document.getElementById('books');
    bookList.innerHTML = '';  // Clear the list

    if (books[subject]) {
        books[subject].forEach(book => {
            const listItem = document.createElement('li');
            const link = document.createElement('a');
            link.href = book;  // Path to local PDF file
            link.target = '_blank';  // Opens PDF in a new tab
            link.textContent = book.split('/').pop().replace('_', ' ').replace('.pdf', '');  // Display book name without folder structure

            listItem.appendChild(link);
            bookList.appendChild(listItem);
        });
    }

    document.getElementById('book-list').style.display = 'block';  // Show book list
}



window.onpopstate = function(event) {
    if (event.state) {
        if (event.state.page === 'semester') {
            document.getElementById('stream-selection').style.display = 'none';
            document.getElementById('semester-selection').style.display = 'block';
            document.getElementById('subject-selection').style.display = 'none';
            document.getElementById('book-list').style.display = 'none';
        } else if (event.state.page === 'subject') {
            document.getElementById('stream-selection').style.display = 'none';
            document.getElementById('semester-selection').style.display = 'none';
            document.getElementById('subject-selection').style.display = 'block';
            document.getElementById('book-list').style.display = 'none';
        } else if (event.state.page === 'book') {
            document.getElementById('stream-selection').style.display = 'none';
            document.getElementById('semester-selection').style.display = 'none';
            document.getElementById('subject-selection').style.display = 'none';
            document.getElementById('book-list').style.display = 'block';
        }
    } else {
        document.getElementById('stream-selection').style.display = 'block';
        document.getElementById('semester-selection').style.display = 'none';
        document.getElementById('subject-selection').style.display = 'none';
        document.getElementById('book-list').style.display = 'none';
    }
};
