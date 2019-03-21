package com.example.prescriptiondrugdata;

public class DrugDataRepository {



    private final String RAW_DATA = "id,company,drug_brand_name,icd10_diagnosis_code,icd10_dx_desc\n" +
            "1,Western Family Foods Inc,miconazole 3,S52202G,\"Unspecified fracture of shaft of left ulna, subsequent encounter for closed fracture with delayed healing\"\n" +
            "2,Conopco Inc. d/b/a Unilever,Axe,S82444G,\"Nondisplaced spiral fracture of shaft of right fibula, subsequent encounter for closed fracture with delayed healing\"\n" +
            "3,\"Chattem, Inc.\",Kaopectate Regular Strength Vanilla Flavor Anti Diarrheal,T491X4A,\"Poisoning by antipruritics, undetermined, initial encounter\"\n" +
            "4,\"Physicians Total Care, Inc.\",Divalproex Sodium,S49032A,\"Salter-Harris Type III physeal fracture of upper end of humerus, left arm, initial encounter for closed fracture\"\n" +
            "5,\"EDWARDS PHARMACEUTICALS, INC.\",ED-SPAZ,S12391,Other nondisplaced fracture of fourth cervical vertebra\n" +
            "6,Cardinal Health,Lisinopril,F40242,Fear of bridges\n" +
            "7,\"Carma Laboratories, Inc.\",CARMEX strawberry lip balm BROAD SPECTRUM SPF 15 SUNSCREEN,T38996D,\"Underdosing of other hormone antagonists, subsequent encounter\"\n" +
            "8,Aidarex Pharmaceuticals LLC,Venlafaxine,T465X1,\"Poisoning by other antihypertensive drugs, accidental (unintentional)\"\n" +
            "9,\"DOLGENCORP, LLC\",Itch Relief,S92066G,\"Nondisplaced intraarticular fracture of unspecified calcaneus, subsequent encounter for fracture with delayed healing\"\n" +
            "10,Valeant Pharmaceuticals North America LLC,Cardizem,T71163S,\"Asphyxiation due to hanging, assault, sequela\"\n" +
            "11,Syntrion GmbH,SyGest,S52112D,\"Torus fracture of upper end of left radius, subsequent encounter for fracture with routine healing\"\n" +
            "12,SHISEIDO AMERICAS CORPORATION,SHISEIDO UV PROTECTIVE FOUNDATION,S63403A,\"Traumatic rupture of unspecified ligament of left middle finger at metacarpophalangeal and interphalangeal joint, initial encounter\"\n" +
            "13,ESTEE LAUDER INC,FUTURIST AGE RESISTING MAKEUP,T22691D,\"Corrosion of second degree of multiple sites of right shoulder and upper limb, except wrist and hand, subsequent encounter\"\n" +
            "14,Natural Health Supply,Painful Menstruation,T85613A,\"Breakdown (mechanical) of artificial skin graft and decellularized allodermis, initial encounter\"\n" +
            "15,\"New Horizon Rx Group, LLC\",Metformin Hydrochloride,S0035,Superficial foreign body of nose\n" +
            "16,\"Norco, Inc.\",MEDICAL AIR,S032,Dislocation of tooth\n" +
            "17,QUALITY CHOICE (Chain Drug Marketing Association),Childrens Dibromm Cold and Allergy,M41127,\"Adolescent idiopathic scoliosis, lumbosacral region\"\n" +
            "18,Biologische Heilmittel Heel,Vinceel,E7500,\"GM2 gangliosidosis, unspecified\"\n" +
            "19,Feelgood Health,K-OK Kiddie Calmer,V273XXA,\"Person boarding or alighting a motorcycle injured in collision with fixed or stationary object, initial encounter\"\n" +
            "20,Fischer Pharmaceuticals Ltd,UltrasolSunscreen,L892,Pressure ulcer of hip\n" +
            "21,\"Antigen Laboratories, Inc.\",Sweet Potato,S52531F,\"Colles' fracture of right radius, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with routine healing\"\n" +
            "22,Meijer Distribution Inc,Allergy Relief D,G454,Transient global amnesia\n" +
            "23,\"Preferred Pharmaceuticals, Inc.\",BENZONATATE,F5081,Binge eating disorder\n" +
            "24,\"Derma Sciences Canada, Inc.\",DERMA GRAN,T22391S,\"Burn of third degree of multiple sites of right shoulder and upper limb, except wrist and hand, sequela\"\n" +
            "25,Walgreen Company,ibuprofen,S62032P,\"Displaced fracture of proximal third of navicular [scaphoid] bone of left wrist, subsequent encounter for fracture with malunion\"\n" +
            "26,\"Avon Products, Inc.\",magiX,S92022A,\"Displaced fracture of anterior process of left calcaneus, initial encounter for closed fracture\"\n" +
            "27,Baxter Healthcare Corporation,Dopamine Hydrochloride and Dextrose,C8291,\"Follicular lymphoma, unspecified, lymph nodes of head, face, and neck\"\n" +
            "28,Niconovum USA Inc.,zonnic nicotine polacrilex,V8181XD,\"Occupant of railway train or railway vehicle injured due to explosion or fire on train, subsequent encounter\"\n" +
            "29,\"Rugby Laboratories, Inc\",Enteric Coated Aspirin,A311,Cutaneous mycobacterial infection\n" +
            "30,SHISEIDO AMERICA INC.,SHISEIDO RADIANT LIFTING FOUNDATION,S049XXA,\"Injury of unspecified cranial nerve, initial encounter\"\n" +
            "31,Ajanta Pharma Limited,RISPERIDONE,S90411,\"Abrasion, right great toe\"\n" +
            "32,Dr. Reddy's Laboratories Inc.,Zoledronic Acid,K4090,\"Unilateral inguinal hernia, without obstruction or gangrene, not specified as recurrent\"\n" +
            "33,\"AMI Cosmetic Co.,Ltd.\",Perfect Calming,S92532G,\"Displaced fracture of distal phalanx of left lesser toe(s), subsequent encounter for fracture with delayed healing\"\n" +
            "34,Pharmacia and Upjohn Company,Depo-Testosterone,S32302D,\"Unspecified fracture of left ilium, subsequent encounter for fracture with routine healing\"\n" +
            "35,REMEDYREPACK INC.,Lidocaine Hydrochloride,S56405D,\"Unspecified injury of extensor muscle, fascia and tendon of right ring finger at forearm level, subsequent encounter\"\n" +
            "36,Kroger Company,allergy,S1531,Minor laceration of internal jugular vein\n" +
            "37,\"Golden State Medical Supply, Inc.\",Tranexamic Acid,M0285,\"Other reactive arthropathies, hip\"\n" +
            "38,\"CARDINAL HEALTH, INC.\",Leader Enema,T85738D,\"Infection and inflammatory reaction due to other nervous system device, implant or graft, subsequent encounter\"\n" +
            "39,\"Breckenridge Pharmaceutical, Inc.\",RIZATRIPTAN Benzoate,P570,Kernicterus due to isoimmunization\n" +
            "40,Zydus Pharmaceuticals (USA) Inc.,Buspirone hydrochloride,S4432,\"Injury of axillary nerve, left arm\"\n" +
            "41,Carilion Materials Management,Rifampin,R898,\"Other abnormal findings in specimens from other organs, systems and tissues\"\n" +
            "42,CleanWell,CleanWell Natural Orange Vanilla Hand Sanitizing Wipes,T22369S,\"Burn of third degree of unspecified scapular region, sequela\"\n" +
            "43,\"Albert Max, Inc.\",PAIN FREE,S63417,Traumatic rupture of collateral ligament of left little finger at metacarpophalangeal and interphalangeal joint\n" +
            "44,\"Fallien Cosmeceuticals, LTD.\",CoTZ SPF 58,S56404S,\"Unspecified injury of extensor muscle, fascia and tendon of left middle finger at forearm level, sequela\"\n" +
            "45,HyVee Inc,HyVee,T400X4,\"Poisoning by opium, undetermined\"\n" +
            "46,Dermalogica,Sebum Clearing Masque,S72412,Displaced unspecified condyle fracture of lower end of left femur\n" +
            "47,Zydus Pharmaceuticals (USA) Inc.,Venlafaxine,E133391,\"Other specified diabetes mellitus with moderate nonproliferative diabetic retinopathy without macular edema, right eye\"\n" +
            "48,Rebel Distributors Corp,Levetiracetam,S85169,\"Unspecified injury of posterior tibial artery, unspecified leg\"\n" +
            "49,\"Native Remedies, LLC\",Conjunct-a-Clear Wash,M0562,Rheumatoid arthritis of elbow with involvement of other organs and systems\n" +
            "50,\"Avion Pharmaceuticals, LLC\",DISALCID,C44122,\"Squamous cell carcinoma of skin of right eyelid, including canthus\"\n" +
            "51,\"Merz Pharmaceuticals, LLC\",Aluvea,N453,Epididymo-orchitis\n" +
            "52,\"Hi-Tech Pharmacal Co., Inc.\",Ciprofloxacin,T602X3,\"Toxic effect of other insecticides, assault\"\n" +
            "53,Rx Pak Division of McKesson Corporation,PERCOCET,S59131G,\"Salter-Harris Type III physeal fracture of upper end of radius, right arm, subsequent encounter for fracture with delayed healing\"\n" +
            "54,Teva Pharmaceuticals USA Inc,Carbamazepine,M7551,Bursitis of right shoulder\n" +
            "55,Qualitest Pharmaceuticals,Metoclopramide,M90511,\"Osteonecrosis in diseases classified elsewhere, right shoulder\"\n" +
            "56,\"Antigen Laboratories, Inc.\",Egg White,H9210,\"Otorrhea, unspecified ear\"\n" +
            "57,\"Preferred Pharmaceuticals, Inc\",Q-Tussin,S02402S,\"Zygomatic fracture, unspecified side, sequela\"\n" +
            "58,STAT Rx USA LLC,HYDROXYZINE PAMOATE,S82044A,\"Nondisplaced comminuted fracture of right patella, initial encounter for closed fracture\"\n" +
            "59,\"Laser Pharmaceuticals, LLC\",Dallergy,S83202D,\"Bucket-handle tear of unspecified meniscus, current injury, unspecified knee, subsequent encounter\"\n" +
            "60,Fresenius Medical Care North America,DELFLEX,V726,Passenger on bus injured in collision with two- or three-wheeled motor vehicle in traffic accident\n" +
            "61,Aurobindo Pharma Limited,Finasteride,S52562B,\"Barton's fracture of left radius, initial encounter for open fracture type I or II\"\n" +
            "62,H.E.B.,ORCHID,S65011A,\"Laceration of ulnar artery at wrist and hand level of right arm, initial encounter\"\n" +
            "63,Jubilant HollisterStier LLC,Molds - Alternaria/Hormodendrum Mix,T444X2D,\"Poisoning by predominantly alpha-adrenoreceptor agonists, intentional self-harm, subsequent encounter\"\n" +
            "64,\"Conney Safety Products, LLC\",Conney Extra Strength Aspirin Free,S62315P,\"Displaced fracture of base of fourth metacarpal bone, left hand, subsequent encounter for fracture with malunion\"\n" +
            "65,West-ward Pharmaceutical Corp.,Phenylephrine Hydrochloride,S62209P,\"Unspecified fracture of first metacarpal bone, unspecified hand, subsequent encounter for fracture with malunion\"\n" +
            "66,Cardinal Health,Petroleum Skin Protectant,H95199,\"Other disorders following mastoidectomy, unspecified ear\"\n" +
            "67,Borden Company (Private) Limited,Muscular Balm,M80862P,\"Other osteoporosis with current pathological fracture, left lower leg, subsequent encounter for fracture with malunion\"\n" +
            "68,Cardinal Health,Lidocaine Hydrochloride and Epinephrine,H16043,\"Marginal corneal ulcer, bilateral\"\n" +
            "69,Cardinal Health,leader nite time,C223,Angiosarcoma of liver\n" +
            "70,Save-A-Lot Food Stores Ltd,being well cold flu relief,S9782XA,\"Crushing injury of left foot, initial encounter\"\n" +
            "71,Fred's,Miconazole 7,J929,Pleural plaque without asbestos\n" +
            "72,BCM Cosmetique SAS,No7 Lift and Luminate Foundation Sunscreen Broad Spectrum SPF 15 Warm Sand,S82465A,\"Nondisplaced segmental fracture of shaft of left fibula, initial encounter for closed fracture\"\n" +
            "73,\"Nelco Laboratories, Inc.\",White Pine,T564X4,\"Toxic effect of copper and its compounds, undetermined\"\n" +
            "74,Kmart Corporation,smart sense sinus,C6900,Malignant neoplasm of unspecified conjunctiva\n" +
            "75,\"Elite Laboratories, Inc.\",Phentermine Hydrochloride,V310XXD,\"Driver of three-wheeled motor vehicle injured in collision with pedal cycle in nontraffic accident, subsequent encounter\"\n" +
            "76,Clinical Solutions Wholesale,Naproxen,S43302A,\"Subluxation of unspecified parts of left shoulder girdle, initial encounter\"\n" +
            "77,\"Physicians Total Care, Inc.\",Betamethasone Dipropionate,M84412P,\"Pathological fracture, left shoulder, subsequent encounter for fracture with malunion\"\n" +
            "78,Actavis Elizabeth LLC,Glipizide,H02732,Vitiligo of right lower eyelid and periocular area\n" +
            "79,\"H and P Industries, Inc. dba Triad Group\",Antiseptic Hand Gel,H179,Unspecified corneal scar and opacity\n" +
            "80,\"Rituals Cosmetics USA, Inc.\",RITUALS Essential Anti-Aging Day SPF 15 sunscreen broad spectrum normal to dry skin,V9180XA,\"Other injury due to other accident to merchant ship, initial encounter\"\n" +
            "81,Jubilant HollisterStier LLC,\"Pollens - Grasses, Bahia Grass Paspalum notatum\",S170XXS,\"Crushing injury of larynx and trachea, sequela\"\n" +
            "82,Unit Dose Services,Levothyroxine Sodium,X16,\"Contact with hot heating appliances, radiators and pipes\"\n" +
            "83,American Health Packaging,Ranitidine,S53016,Anterior dislocation of unspecified radial head\n" +
            "84,HOMEOLAB USA INC.,EARACHE RELIEF,K9403,Colostomy malfunction\n" +
            "85,\"Hospira, Inc.\",Potassium Chloride in Sodium Chloride,C4460,\"Unspecified malignant neoplasm of skin of upper limb, including shoulder\"\n" +
            "86,BluePoint Laboratories,Levetiracetam,S62032B,\"Displaced fracture of proximal third of navicular [scaphoid] bone of left wrist, initial encounter for open fracture\"\n" +
            "87,\"Preferred Pharmaceuticals, Inc.\",Simvastatin,T460X6S,\"Underdosing of cardiac-stimulant glycosides and drugs of similar action, sequela\"\n" +
            "88,Dynarex Corporation,Dynarex Hydrogel,O23519,\"Infections of cervix in pregnancy, unspecified trimester\"\n" +
            "89,\"Breckenridge Pharmaceutical, Inc.\",Levetiracetam,P84,Other problems with newborn\n" +
            "90,Jubilant HollisterStier LLC,\"Pollens - Weeds and Garden Plants, Plantain, English Plantago lanceolata\",K9281,Gastrointestinal mucositis (ulcerative)\n" +
            "91,Pekana-Naturheilmittel GmbH,Zellulisan,Z3043,Encounter for surveillance of intrauterine contraceptive device\n" +
            "92,Natures Investment Holdings Pty Ltd dba Maxrelief USA,MaxRelief Arnica,S62317D,\"Displaced fracture of base of fifth metacarpal bone. left hand, subsequent encounter for fracture with routine healing\"\n" +
            "93,O.E. Meyer Company,AIR COMPRESSED,S72061N,\"Displaced articular fracture of head of right femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with nonunion\"\n" +
            "94,American Health Packaging,Divalproex Sodium,V529,Unspecified occupant of pick-up truck or van injured in collision with two- or three-wheeled motor vehicle in traffic accident\n" +
            "95,Unit Dose Services,Tizanidine,S40022A,\"Contusion of left upper arm, initial encounter\"\n" +
            "96,Aidarex Pharmaceuticals LLC,MEDROX,H02421,Myogenic ptosis of right eyelid\n" +
            "97,\"Roxane Laboratories, Inc.\",Telmisartan,S82143E,\"Displaced bicondylar fracture of unspecified tibia, subsequent encounter for open fracture type I or II with routine healing\"\n" +
            "98,AstraZeneca LP,ATACAND,D2272,\"Melanocytic nevi of left lower limb, including hip\"\n" +
            "99,BluePoint Laboratories,Zonisamide,S72034D,\"Nondisplaced midcervical fracture of right femur, subsequent encounter for closed fracture with routine healing\"\n" +
            "100,Lake Erie Medical & Surgical Supply DBA Quality Care Products LLC,Propranolol Hydrochloride,E71542,Other group 3 peroxisomal disorders\n" +
            "101,Dr. Reddy's Laboratories Limited,Moxifloxacin,S92254G,\"Nondisplaced fracture of navicular [scaphoid] of right foot, subsequent encounter for fracture with delayed healing\"\n" +
            "102,North Safety Products,Aypanal,S99142B,\"Salter-Harris Type IV physeal fracture of left metatarsal, initial encounter for open fracture\"\n" +
            "103,HOMEOLAB USA INC.,CONIUM MACULATUM,M8613,\"Other acute osteomyelitis, radius and ulna\"\n" +
            "104,\"Shopko Stores Operating Co., LLC\",Allergy Relief,S43011D,\"Anterior subluxation of right humerus, subsequent encounter\"\n" +
            "105,\"Deb USA, Inc.\",InstantFOAM alcohol hand sanitizer,S92231B,\"Displaced fracture of intermediate cuneiform of right foot, initial encounter for open fracture\"\n" +
            "106,\"Caraco Pharmaceutical Laboratories, Ltd.\",\"Dextroamphetamine saccharate, amphetamine aspartate, dextroamphetamine sulfate, and amphetamine sulfate\",T43503,\"Poisoning by unspecified antipsychotics and neuroleptics, assault\"\n" +
            "107,AMERICAN SALES COMPANY,CAREONE,V652XXD,\"Person on outside of heavy transport vehicle injured in collision with railway train or railway vehicle in nontraffic accident, subsequent encounter\"\n" +
            "108,\"Lake Erie Medical & Surgical Supply, DBA Quality Care Products, LLC\",Lyrica,S72343F,\"Displaced spiral fracture of shaft of unspecified femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with routine healing\"\n" +
            "109,\"Galderma Laboratories, L.P.\",Rosanil,S82042A,\"Displaced comminuted fracture of left patella, initial encounter for closed fracture\"\n" +
            "110,\"Johnson & Johnson Healthcare Products, Division of McNEIL-PPC, Inc.\",Listerine Whitening Fluoride Anticavity,T88,\"Other complications of surgical and medical care, not elsewhere classified\"\n" +
            "111,REMEDYREPACK INC.,Levothyroxine sodium,S61401,Unspecified open wound of right hand\n" +
            "112,\"Paddock Laboratories, LLC\",70%,H5042,Monofixation syndrome\n" +
            "113,AR Medicom Inc,DentiCare Pro-Foam,D010,Carcinoma in situ of colon\n" +
            "114,Air Liquide America Specialty Gases LLC,NITROUS OXIDE,S42115D,\"Nondisplaced fracture of body of scapula, left shoulder, subsequent encounter for fracture with routine healing\"\n" +
            "115,Lake Erie Medical DBA Quality Care Products LLC,Baclofen,S06357S,\"Traumatic hemorrhage of left cerebrum with loss of consciousness of any duration with death due to brain injury prior to regaining consciousness, sequela\"\n" +
            "116,ENCHANTE ACCESSORIES INC.,RUE21 Strawberry Antibacterial Hand Sanitizer,H04201,\"Unspecified epiphora, right lacrimal gland\"\n" +
            "117,Supervalu Inc,equaline allergy,S59142K,\"Salter-Harris Type IV physeal fracture of upper end of radius, left arm, subsequent encounter for fracture with nonunion\"\n" +
            "118,Qualitest Pharmaceuticals,Lisinopril,S72144,Nondisplaced intertrochanteric fracture of right femur\n" +
            "119,Jubilant HollisterStier LLC,\"Pollens - Trees, Tree Mix 5\",S52522D,\"Torus fracture of lower end of left radius, subsequent encounter for fracture with routine healing\"\n" +
            "120,Natural Health Supply,MUSCLE SPASMS,W932,Prolonged exposure in deep freeze unit or refrigerator\n" +
            "121,Major Pharmaceuticals,Naproxen,S32129,Unspecified Zone II fracture of sacrum\n" +
            "122,\"Nelco Laboratories, Inc.\",Crab,Y931,Activities involving water and water craft\n" +
            "123,\"H.J. Harkins Company, Inc.\",Metronidazole,M06371,\"Rheumatoid nodule, right ankle and foot\"\n" +
            "124,\"Roxane Laboratories, Inc\",Meperidine Hydrochloride,T3461XS,\"Frostbite with tissue necrosis of right hip and thigh, sequela\"\n" +
            "125,REMEDYREPACK INC.,Levothyroxine Sodium,T22449D,\"Corrosion of unspecified degree of unspecified axilla, subsequent encounter\"\n" +
            "126,Par Pharmaceutical Inc,Doxycycline,P2811,Resorption atelectasis without respiratory distress syndrome\n" +
            "127,GE Healthcare Inc.,Optison,T23402S,\"Corrosion of unspecified degree of left hand, unspecified site, sequela\"\n" +
            "128,\"Warner Chilcott (US), LLC\",femhrt,S3991XD,\"Unspecified injury of abdomen, subsequent encounter\"\n" +
            "129,BCM Cosmetique SAS,No7 Lift and Luminate Foundation Sunscreen Broad Spectrum SPF 15 Cool Beige,S1095XD,\"Superficial foreign body of unspecified part of neck, subsequent encounter\"\n" +
            "130,\"Elizabeth Arden, Inc\",Flawless Finish Bare Perfection Makeup SPF 8 Beige,M84363,\"Stress fracture, right fibula\"\n" +
            "131,Rimmel Inc.,Long Lasting Finish with Comfort Serum,H35449,\"Age-related reticular degeneration of retina, unspecified eye\"\n" +
            "132,CVS Pharmacy,Ear Wax Removal System,M7112,\"Other infective bursitis, elbow\"\n" +
            "133,Endo Pharmaceuticals,OPANA,S52532J,\"Colles' fracture of left radius, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with delayed healing\"\n" +
            "134,\"Airgas-West, Inc.\",Nitrous Oxide,M1A3120,\"Chronic gout due to renal impairment, left shoulder, without tophus (tophi)\"\n" +
            "135,L'Oreal USA Florence Manufacturing,Garnier Fructis Antidandruff,T477X1D,\"Poisoning by emetics, accidental (unintentional), subsequent encounter\"\n" +
            "136,Sun Pharmaceutical Industries Limited,Olanzapine,S52283S,\"Bent bone of unspecified ulna, sequela\"\n" +
            "137,\"Physicians Total Care, Inc.\",RHINOCORT AQUA,T83411,Breakdown (mechanical) of implanted testicular prosthesis\n" +
            "138,\"Dispensing Solutions, Inc.\",Nifedipine,W6169XD,\"Other contact with duck, subsequent encounter\"\n" +
            "139,\"Deseret Biologicals, Inc.\",Cerebromax,S52225R,\"Nondisplaced transverse fracture of shaft of left ulna, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with malunion\"\n" +
            "140,American Health Packaging,Ziprasidone Hydrochloride,M4800,\"Spinal stenosis, site unspecified\"\n" +
            "141,\"Amneal Pharmaceuticals, LLC\",Sulfamethoxazole and Trimethoprim,S72465Q,\"Nondisplaced supracondylar fracture with intracondylar extension of lower end of left femur, subsequent encounter for open fracture type I or II with malunion\"\n" +
            "142,West-ward Pharmaceutical Corp.,Heparin Sodium,D163,Benign neoplasm of short bones of lower limb\n" +
            "143,Kosan Kozmetik Sanayi ve Ticaret A.S.,flormar BB Sheer Tinted Beauty Sunscreen Broad Spectrum SPF 15 02 Light Medium,S72344P,\"Nondisplaced spiral fracture of shaft of right femur, subsequent encounter for closed fracture with malunion\"\n" +
            "144,Chester Packaging,gent-L-tip,T2263,Corrosion of second degree of upper arm\n" +
            "145,SMART SENSE (Kmart),Stool Softener,R451,Restlessness and agitation\n" +
            "146,Jubilant HollisterStier LLC,Molds - Trichophyton Mix,S92531D,\"Displaced fracture of distal phalanx of right lesser toe(s), subsequent encounter for fracture with routine healing\"\n" +
            "147,Camber Pharmaceuticals Inc.,Gabapentin,M87859,\"Other osteonecrosis, unspecified femur\"\n" +
            "148,Procter & Gamble Manufacturing Co.,Head and Shoulders,M12122,\"Kaschin-Beck disease, left elbow\"\n" +
            "149,A-S Medication Solutions LLC,Lorazepam,S82145P,\"Nondisplaced bicondylar fracture of left tibia, subsequent encounter for closed fracture with malunion\"\n" +
            "150,\"Hospira, Inc.\",Enalaprilat,V607XXS,\"Person on outside of heavy transport vehicle injured in collision with pedestrian or animal in traffic accident, sequela\"\n" +
            "151,\"Hospira, Inc.\",Aminosyn Sulfite Free,W1612,Fall into natural body of water striking bottom\n" +
            "152,Teva Select Brands,Adderall,O30812,\"Other specified multiple gestation with two or more monochorionic fetuses, second trimester\"\n" +
            "153,\"Graceway Pharmaceuticals, LLC\",Maxair Autohaler,S36539,Laceration of unspecified part of colon\n" +
            "154,RITE AID CORPORATION,Rite Aid Sunscreen,S23132D,\"Subluxation of T5/T6 thoracic vertebra, subsequent encounter\"\n" +
            "155,\"PD-Rx Pharmaceuticals, Inc.\",Escitalopram,S75001,\"Unspecified injury of femoral artery, right leg\"\n" +
            "156,ETHEX Corporation,Morphine Sulfate,W408XXS,\"Explosion of other specified explosive materials, sequela\"\n" +
            "157,Primus Pharmaceuticals,Alcortin,S30864S,\"Insect bite (nonvenomous) of vagina and vulva, sequela\"\n" +
            "158,\"Marc Glassman, Inc.\",Nighttime Cold and Flu,S99249P,\"Salter-Harris Type IV physeal fracture of phalanx of unspecified toe, subsequent encounter for fracture with malunion\"\n" +
            "159,Aurobindo Pharma Limited,Gabapentin,S63114A,\"Dislocation of metacarpophalangeal joint of right thumb, initial encounter\"\n" +
            "160,Actavis Elizabeth LLC,Oxymorphone hydrochloride,V400,Car driver injured in collision with pedestrian or animal in nontraffic accident\n" +
            "161,\"Deseret Biologicals, Inc.\",Norepinephrine,M6788,\"Other specified disorders of synovium and tendon, other site\"\n" +
            "162,Conopco Inc. d/b/a Unilever,Degree,S01411A,\"Laceration without foreign body of right cheek and temporomandibular area, initial encounter\"\n" +
            "163,REMEDYREPACK INC.,Lorazepam,V212XXD,\"Unspecified motorcycle rider injured in collision with pedal cycle in nontraffic accident, subsequent encounter\"\n" +
            "164,HyVee Inc,allergy relief,S89091A,\"Other physeal fracture of upper end of right tibia, initial encounter for closed fracture\"\n" +
            "165,\"Newton Laboratories, Inc.\",Cold Hands - Feet,S92354,\"Nondisplaced fracture of fifth metatarsal bone, right foot\"\n" +
            "166,VVF Illinois Services,Right Guard Sport,T382X5A,\"Adverse effect of antithyroid drugs, initial encounter\"\n" +
            "167,Jubilant HollisterStier LLC,Yellow Hornet hymenoptera venom Multidose,D3160,Benign neoplasm of unspecified site of unspecified orbit\n" +
            "168,\"Hospira, Inc.\",Gemcitabine,Z000,Encounter for general adult medical examination\n" +
            "169,Crosstex International Inc.,Gumnumb Topical Anesthetic,S53002A,\"Unspecified subluxation of left radial head, initial encounter\"\n" +
            "170,STAT RX USA LLC,PLAVIX,W21220A,\"Struck by ice hockey puck, initial encounter\"\n" +
            "171,\"GRIFOLS USA, LLC\",Albutein,T491X5,Adverse effect of antipruritics\n" +
            "172,\"Genentech, Inc.\",Activase,Y655,Performance of wrong procedure (operation)\n" +
            "173,Parfums Christian Dior,CD DIORSKIN NUDE SKIN-GLOWING MAKEUP SUNSCREEN BROAD SPECTRUM SPF 15 010 Ivory,T85121S,\"Displacement of implanted electronic neurostimulator of peripheral nerve electrode (lead), sequela\"\n" +
            "174,KINeSYS Pharmaceuticals Inc.,Kinesys,Z3A49,Greater than 42 weeks gestation of pregnancy\n" +
            "175,\"Stephen L. LaFrance Pharmacy, Inc.\",Maximum Strength Pseudoephedrine,T22169D,\"Burn of first degree of unspecified scapular region, subsequent encounter\"\n" +
            "176,HOMEOLAB USA INC,PHOSPHORUS,S98121A,\"Partial traumatic amputation of right great toe, initial encounter\"\n" +
            "177,\"Rejoice International, Inc.\",Instant Hand Sanitizer - Cocoa Butter,S52226A,\"Nondisplaced transverse fracture of shaft of unspecified ulna, initial encounter for closed fracture\"\n" +
            "178,walgreens,Walgreens,S99029,Salter-Harris Type II physeal fracture of unspecified calcaneus\n" +
            "179,CVS Pharmacy,anti diarrheal,S42365S,\"Nondisplaced segmental fracture of shaft of humerus, left arm, sequela\"\n" +
            "180,\"AvKARE, Inc.\",Trazodone Hydrochloride,G404,Other generalized epilepsy and epileptic syndromes\n" +
            "181,\"Deseret Biologicals, Inc.\",Formaldehyde,S8291XQ,\"Unspecified fracture of right lower leg, subsequent encounter for open fracture type I or II with malunion\"\n" +
            "182,\"Two Hip Consulting, LLC\",MEDI-DERM / L WITH LIDOCAINE,S37051A,\"Moderate laceration of right kidney, initial encounter\"\n" +
            "183,McKesson,Earwax Removal Kit,S92116K,\"Nondisplaced fracture of neck of unspecified talus, subsequent encounter for fracture with nonunion\"\n" +
            "184,Ventura Corporation LTD,ESIKA HYDRACOLOR 2 IN 1 HIGHLY MOISTURIZING AND COLORING SPF 25,S069X1S,\"Unspecified intracranial injury with loss of consciousness of 30 minutes or less, sequela\"\n" +
            "185,\"Amneal Pharmaceuticals of New York, LLC\",Citalopram,S82101E,\"Unspecified fracture of upper end of right tibia, subsequent encounter for open fracture type I or II with routine healing\"\n" +
            "186,\"Deseret Biologicals, Inc.\",Intestinal Distress,C713,Malignant neoplasm of parietal lobe\n" +
            "187,Bryant Ranch Prepack,Ibuprofen,T374X5A,\"Adverse effect of anthelminthics, initial encounter\"\n" +
            "188,Bedford Laboratories,Fluconazole,T4145XD,\"Adverse effect of unspecified anesthetic, subsequent encounter\"\n" +
            "189,Bryant Ranch Prepack,pravastatin sodium,F4000,\"Agoraphobia, unspecified\"\n" +
            "190,American Health Packaging,Ramipril,I6621,Occlusion and stenosis of right posterior cerebral artery\n" +
            "191,\"Young Dental Manufacturing Co 1, LLC.\",Perfect Choice,X75XXXS,\"Intentional self-harm by explosive material, sequela\"\n" +
            "192,\"Mutual Pharmaceutical Company, Inc.\",Spironolactone and Hydrochlorothiazide,Z6845,\"Body mass index (BMI) 70 or greater, adult\"\n" +
            "193,Coty US LLC,ck one waterfresh face makeup spf 15,T22369S,\"Burn of third degree of unspecified scapular region, sequela\"\n" +
            "194,\"Liberty Pharmaceuticals, Inc.\",Hydroxyzine Hydrochloride,T63624D,\"Toxic effect of contact with other jellyfish, undetermined, subsequent encounter\"\n" +
            "195,Lake Erie Medical & Surgical Supply DBA Quality Care Products LLC,Dicloxacillin Sodium,S01441D,\"Puncture wound with foreign body of right cheek and temporomandibular area, subsequent encounter\"\n" +
            "196,Athlete's Needs Inc,Clear Choice Allergy Relief,R041,Hemorrhage from throat\n" +
            "197,Mylan Pharmaceuticals Inc.,Tramadol Hydrochloride,A229,\"Anthrax, unspecified\"\n" +
            "198,\"Lupin Pharmaceuticals, Inc.\",Losartan Potassium,S70922S,\"Unspecified superficial injury of left thigh, sequela\"\n" +
            "199,\"General Injectables & Vaccines, Inc\",Doxycycline,S72412M,\"Displaced unspecified condyle fracture of lower end of left femur, subsequent encounter for open fracture type I or II with nonunion\"\n" +
            "200,Kmart Corporation,Smart Sense Anti Diarrheal,V331XXA,\"Passenger in three-wheeled motor vehicle injured in collision with car, pick-up truck or van in nontraffic accident, initial encounter\"\n" +
            "201,\"MedVantx, Inc.\",Simvastatin,S76809S,\"Unspecified injury of other specified muscles, fascia and tendons at thigh level, unspecified thigh, sequela\"\n" +
            "202,Sun Pharma Global FZE,TRAMADOL HYDROCHLORIDE,S76019,\"Strain of muscle, fascia and tendon of unspecified hip\"\n" +
            "203,American Health Packaging,\"Dextroamphetamine Saccharate, Amphetamine Aspartate, Dextroamphetamine Sulfate and Amphetamine Sulfate\",C46,Kaposi's sarcoma\n" +
            "204,Home Sweet Homeopathics,Ingrown Toenails,M67911,\"Unspecified disorder of synovium and tendon, right shoulder\"\n" +
            "205,\"H.J. Harkins Company, Inc.\",Ibuprofen,S48022D,\"Partial traumatic amputation at left shoulder joint, subsequent encounter\"\n" +
            "206,Dr. Reddy's Laboratories Limited,ziprasidone hydrochloride,H401391,\"Pigmentary glaucoma, unspecified eye, mild stage\"\n" +
            "207,Sandoz Inc.,KLOR-CON,T22349S,\"Burn of third degree of unspecified axilla, sequela\"\n" +
            "208,\"Roxane Laboratories, Inc\",Lithium Carbonate,S46102D,\"Unspecified injury of muscle, fascia and tendon of long head of biceps, left arm, subsequent encounter\"\n" +
            "209,\"ALK-Abello, Inc.\",PERIPLANETA AMERICANA,S080XXA,\"Avulsion of scalp, initial encounter\"\n" +
            "210,Heritage Pharmaceuticals Inc.,Metronidazole,S40019D,\"Contusion of unspecified shoulder, subsequent encounter\"\n" +
            "211,\"Nelco Laboratories, Inc.\",Cultivated Rye,S21059D,\"Open bite of unspecified breast, subsequent encounter\"\n" +
            "212,PERIOSCIENCES LLC,PERIOSCIENCES HYDRATING AO Pro,L919,\"Hypertrophic disorder of the skin, unspecified\"\n" +
            "213,REMEDYREPACK INC.,Ibuprofen,S61509,Unspecified open wound of unspecified wrist\n" +
            "214,\"Physicians Total Care, Inc.\",Nystatin and Triamcinolone Acetonide,S56113D,\"Strain of flexor muscle, fascia and tendon of right middle finger at forearm level, subsequent encounter\"\n" +
            "215,REMEDYREPACK INC.,Potassium Chloride,S42363K,\"Displaced segmental fracture of shaft of humerus, unspecified arm, subsequent encounter for fracture with nonunion\"\n" +
            "216,\"Paddock Laboratories, LLC\",Morphine Sulfate,T207,\"Corrosion of third degree of head, face, and neck\"\n" +
            "217,Neutrogena Corporation,Neutrogena Nourishing Long Wear Makeup Tone Correcting Complex Sunscreen Broad Spectrum SPF20,M4855XD,\"Collapsed vertebra, not elsewhere classified, thoracolumbar region, subsequent encounter for fracture with routine healing\"\n" +
            "218,S+,SEPHORA Skin Perfect CC Sunscreen Broad Spectrum SPF 20 FAIR,M1A4720,\"Other secondary chronic gout, left ankle and foot, without tophus (tophi)\"\n" +
            "219,DOCTOR C&C,HES CLEAN EVE,V109,Unspecified pedal cyclist injured in collision with pedestrian or animal in traffic accident\n" +
            "220,\"Nelco Laboratories, Inc.\",California Black Oak,S65099D,\"Other specified injury of ulnar artery at wrist and hand level of unspecified arm, subsequent encounter\"\n" +
            "221,Rebel Distributors Corp,epinephrine,S72402B,\"Unspecified fracture of lower end of left femur, initial encounter for open fracture type I or II\"\n" +
            "222,Sun Pharma Global FZE,Entacapone,T39015S,\"Adverse effect of aspirin, sequela\"\n" +
            "223,\"Desert Biologicals, Inc.\",Professional Weight Support,C9031,Solitary plasmacytoma in remission\n" +
            "224,STAT RX USA LLC,CEPHALEXIN,S71052A,\"Open bite, left hip, initial encounter\"\n" +
            "225,Rugby Laboratories Inc.,Acetaminophen and Diphenhydramine HCl,S56009S,\"Unspecified injury of flexor muscle, fascia and tendon of unspecified thumb at forearm level, sequela\"\n" +
            "226,REMEDYREPACK INC.,Isosorbide Dinitrate,T2439,\"Burn of third degree of multiple sites of lower limb, except ankle and foot\"\n" +
            "227,\"Nelco Laboratories, Inc.\",Poplar,S7510,Unspecified injury of femoral vein at hip and thigh level\n" +
            "228,Preferred Plus (Kinray),Aspirin,S55092A,\"Other specified injury of ulnar artery at forearm level, left arm, initial encounter\"\n" +
            "229,KANEBO COSMETICS INC,SENSAI FLUID FINISH FF206,S82231Q,\"Displaced oblique fracture of shaft of right tibia, subsequent encounter for open fracture type I or II with malunion\"\n" +
            "230,MD Formulations,Sun Total Protector Color 30 Dark Tint,Y92000,Kitchen of unspecified non-institutional (private) residence as  the place of occurrence of the external cause\n" +
            "231,\"PD-Rx Pharmaceuticals, Inc.\",Diflucan,Z12,Encounter for screening for malignant neoplasms\n" +
            "232,Proficient Rx LP,Atenolol,S32021A,\"Stable burst fracture of second lumbar vertebra, initial encounter for closed fracture\"\n" +
            "233,\"Prime Enterprises, Inc.\",Australian Gold,M1A1211,\"Lead-induced chronic gout, right elbow, with tophus (tophi)\"\n" +
            "234,ENERGIZER PERSONAL CARE LLC,Hawaiian Tropic Dry,V704XXA,\"Person boarding or alighting from bus injured in collision with pedestrian or animal, initial encounter\"\n" +
            "235,Sandoz Inc,Ceftriaxone Sodium,T24109A,\"Burn of first degree of unspecified site of unspecified lower limb, except ankle and foot, initial encounter\"\n" +
            "236,\"BioActive Nutritional, Inc.\",Anti Hive,M89125,\"Complete physeal arrest, right distal humerus\"\n" +
            "237,Parfums Christian Dior,CD Dior Prestige White Collection Satin Brightening UV Base SPF 50,M84611G,\"Pathological fracture in other disease, right shoulder, subsequent encounter for fracture with delayed healing\"\n" +
            "238,Good Neighbor Pharmacy,Triacting Day Time,H68133,\"Extrinsic cartilagenous obstruction of Eustachian tube, bilateral\"\n" +
            "239,Procter & Gamble Manufacturing Company,Secret Scent Expressions,C8416,\"Sezary disease, intrapelvic lymph nodes\"\n" +
            "240,\"Blenheim Pharmacal, Inc.\",Furosemide,T34822D,\"Frostbite with tissue necrosis of left foot, subsequent encounter\"\n" +
            "241,\"Aphena Pharma Solutions - Tennessee, LLC\",Naproxen,R92,Abnormal and inconclusive findings on diagnostic imaging of breast\n" +
            "242,\"Selgel Mexico, S.A. de C.V.\",Cough and Cold,I69015,Cognitive social or emotional deficit following nontraumatic subarachnoid hemorrhage\n" +
            "243,A P J Laboratories Limited,APINOPHEN,O3100X0,\"Papyraceous fetus, unspecified trimester, not applicable or unspecified\"\n" +
            "244,Bryant Ranch Prepack,Nifedipine,S83231,\"Complex tear of medial meniscus, current injury, right knee\"\n" +
            "245,\"NCS HealthCare of KY, Inc dba Vangard Labs\",Haloperidol,N209,\"Urinary calculus, unspecified\"\n" +
            "246,Kramer Novis,G-P-TUSS DXP,T423X6,Underdosing of barbiturates\n" +
            "247,Bare Escentuals Beauty Inc.,bareMinerals READY Touch Up Veil Broad Spectrum SPF 15,S99009G,\"Unspecified physeal fracture of unspecified calcaneus, subsequent encounter for fracture with delayed healing\"\n" +
            "248,\"WESTERN FAMILY FOODS, INC.\",Western Family Broad Spectrum SunscreenSPF 50,T24631S,\"Corrosion of second degree of right lower leg, sequela\"\n" +
            "249,Major Pharmaceuticals,SudoGest,S52236F,\"Nondisplaced oblique fracture of shaft of unspecified ulna, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with routine healing\"\n" +
            "250,\"Vitality Works, Inc.\",THY-Plex,T2150XS,\"Corrosion of first degree of trunk, unspecified site, sequela\"\n" +
            "251,Cardinal Health,Lidocaine Hydrochloride,T374X4,\"Poisoning by anthelminthics, undetermined\"\n" +
            "252,\"Nelco Laboratories, Inc.\",Brussels Sprout,T40696,Underdosing of other narcotics\n" +
            "253,\"Takeda Pharmaceuticals America, Inc.\",Amitiza,S52252K,\"Displaced comminuted fracture of shaft of ulna, left arm, subsequent encounter for closed fracture with nonunion\"\n" +
            "254,Dr. Reddy's Laboratories Limited,gemcitabine,S82036R,\"Nondisplaced transverse fracture of unspecified patella, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with malunion\"\n" +
            "255,Exelan Pharmaceuticals Inc.,Escitalopram oxalate,S42153B,\"Displaced fracture of neck of scapula, unspecified shoulder, initial encounter for open fracture\"\n" +
            "256,Wockhardt Limited,Ropinirole Hydrochloride,A667,Other manifestations of yaws\n" +
            "257,CLINIQUE LABORATORIES INC,CLINIQUE REDNESS SOLUTIONS,E113542,\"Type 2 diabetes mellitus with proliferative diabetic retinopathy with combined traction retinal detachment and rhegmatogenous retinal detachment, left eye\"\n" +
            "258,\"Physicians Total Care, Inc.\",PROVIGIL,S66111S,\"Strain of flexor muscle, fascia and tendon of left index finger at wrist and hand level, sequela\"\n" +
            "259,\"PD-Rx Pharmaceuticals, Inc.\",Clonidine Hydrochloride,A506,\"Late congenital syphilis, latent\"\n" +
            "260,Hy-Vee,All Day Allergy,M90861,\"Osteopathy in diseases classified elsewhere, right lower leg\"\n" +
            "261,\"ALK-Abello, Inc.\",RABBIT,C6982,Malignant neoplasm of overlapping sites of left eye and adnexa\n" +
            "262,\"WG Critical Care, LLC\",Ampicillin and Sulbactam,S98119D,\"Complete traumatic amputation of unspecified great toe, subsequent encounter\"\n" +
            "263,Pharmacia and Upjohn Company,Glynase,S92334K,\"Nondisplaced fracture of third metatarsal bone, right foot, subsequent encounter for fracture with nonunion\"\n" +
            "264,Remedy Makers,ARNICA MONTANA,T8289,\"Other specified complication of cardiac and vascular prosthetic devices, implants and grafts\"\n" +
            "265,Cardinal Health,Tacrolimus,M62531,\"Muscle wasting and atrophy, not elsewhere classified, right forearm\"\n" +
            "266,\"PSS World Medical, Inc.\",Antifungal,H5504,Dissociated nystagmus\n" +
            "267,\"Richmond Pharmaceuticals, Inc.\",ribavirin,K267,Chronic duodenal ulcer without hemorrhage or perforation\n" +
            "268,Washington Homeopathic Products,Colds and Cough,T82311A,\"Breakdown (mechanical) of carotid arterial graft (bypass), initial encounter\"\n" +
            "269,Carilion Materials Management,Nicardipine Hydrochloride,S62623B,\"Displaced fracture of medial phalanx of left middle finger, initial encounter for open fracture\"\n" +
            "270,Seatex Ltd,Antibacterial,S82151H,\"Displaced fracture of right tibial tuberosity, subsequent encounter for open fracture type I or II with delayed healing\"\n" +
            "271,Calmar dba A&R Medical Supply,OXYGEN,T88,\"Other complications of surgical and medical care, not elsewhere classified\"\n" +
            "272,\"Wasatch Product Development, LLC\",Age Defying Blemish Treatment,S63105A,\"Unspecified dislocation of left thumb, initial encounter\"\n" +
            "273,\"US MedSource, LLC\",Sodium Bicarbonate,S3144XA,\"Puncture wound with foreign body of vagina and vulva, initial encounter\"\n" +
            "274,Roerig,Relpax,G8190,\"Hemiplegia, unspecified affecting unspecified side\"\n" +
            "275,Meijer Distribution Inc,Meijer SPF 8,H310,Chorioretinal scars\n" +
            "276,\"Prestium Pharma, Inc.\",Luxiq,S52023G,\"Displaced fracture of olecranon process without intraarticular extension of unspecified ulna, subsequent encounter for closed fracture with delayed healing\"\n" +
            "277,Major Pharmaceuticals,Levetiracetam,T24531S,\"Corrosion of first degree of right lower leg, sequela\"\n" +
            "278,\"Antigen Laboratories, Inc.\",Mixture of Standardized and Non-Standardized Southern Grasses,O0281,Inappropriate change in quantitative human chorionic gonadotropin (hCG) in early pregnancy\n" +
            "279,Nomax Inc.,Effer-K,W2210XA,\"Striking against or struck by unspecified automobile airbag, initial encounter\"\n" +
            "280,\"Actavis Pharma, Inc.\",Norco,R1930,\"Abdominal rigidity, unspecified site\"\n" +
            "281,Cardinal Health,Leader Hemorrholidal,S9303,Subluxation of unspecified ankle joint\n" +
            "282,Teva Pharmaceuticals USA Inc,Amoxicillin and Clavulanate Potassium,S32412G,\"Displaced fracture of anterior wall of left acetabulum, subsequent encounter for fracture with delayed healing\"\n" +
            "283,\"Medline Industries, Inc.\",Remedy Antifungal,S0012XD,\"Contusion of left eyelid and periocular area, subsequent encounter\"\n" +
            "284,CVS Pharmacy,Pseudoephedrine Hydrochloride,O99712,\"Diseases of the skin and subcutaneous tissue complicating pregnancy, second trimester\"\n" +
            "285,\"True Botanica, LLC\",Belladonna,S92343A,\"Displaced fracture of fourth metatarsal bone, unspecified foot, initial encounter for closed fracture\"\n" +
            "286,King Bio Inc.,Hemorrhoid Symptom Formula,D072,Carcinoma in situ of vagina\n" +
            "287,DIRECT RX,LISINOPRIL AND HYDROCHLOROTHIAZIDE,S52616S,\"Nondisplaced fracture of unspecified ulna styloid process, sequela\"\n" +
            "288,PL Developments,Ibuprofen,M87242,\"Osteonecrosis due to previous trauma, left hand\"\n" +
            "289,DAVA Pharmaceuticals Inc,Amoxicillin,H1606,Mycotic corneal ulcer\n" +
            "290,\"SEINDNI CO., LTD.\",MOIST MOISTURE,S55119A,\"Laceration of radial artery at forearm level, unspecified arm, initial encounter\"\n" +
            "291,McKesson Contract Packaging,Diltiazem Hydrochloride,M0227,\"Postimmunization arthropathy, ankle and foot\"\n" +
            "292,Bryant Ranch Prepack,Risperidone,S96822D,\"Laceration of other specified muscles and tendons at ankle and foot level, left foot, subsequent encounter\"\n" +
            "293,Contract Pharmacy Services-PA,Carbamazepine,T438X3A,\"Poisoning by other psychotropic drugs, assault, initial encounter\"\n" +
            "294,Merck Sharp & Dohme Corp.,EMEND,S3289XD,\"Fracture of other parts of pelvis, subsequent encounter for fracture with routine healing\"\n" +
            "295,\"Nelco Laboratories, Inc.\",Orris Root,M265,Dentofacial functional abnormalities\n" +
            "296,McKesson Packaging Services a business unit of McKesson Corporation,Gabapentin,M88879,Osteitis deformans of unspecified ankle and foot\n" +
            "297,Bryant Ranch Prepack,Enteric Coated Stimulant Laxative,F81,Specific developmental disorders of scholastic skills\n" +
            "298,Cardinal Health,Olanzapine,S60129,Contusion of unspecified index finger with damage to nail\n" +
            "299,\"Nelco Laboratories, Inc.\",Salt Cedar,O0488,Urinary tract infection following (induced) termination of pregnancy\n" +
            "300,STAT RX USA LLC,LORAZEPAM,M65049,\"Abscess of tendon sheath, unspecified hand\"\n" +
            "301,Cardinal Health,Xylocaine,T490X,\"Poisoning by, adverse effect of and underdosing of local antifungal, anti-infective and anti-inflammatory drugs\"\n" +
            "302,\"Medline Industries, Inc.\",Epi-Clenz Plus Instant Hand Sanitizer,S24154S,\"Other incomplete lesion at T11-T12 level of thoracic spinal cord, sequela\"\n" +
            "303,\"Physicians Total Care, Inc.\",LISINOPRIL AND HYDROCHLOROTHIAZIDE,T618X4S,\"Toxic effect of other seafood, undetermined, sequela\"\n" +
            "304,Atlantic Welding Supply,OXYGEN,T23109S,\"Burn of first degree of unspecified hand, unspecified site, sequela\"\n" +
            "305,\"Actavis Pharma, Inc.\",Clindamycin Hydrochloride,S91143A,\"Puncture wound with foreign body of unspecified great toe without damage to nail, initial encounter\"\n" +
            "306,Preferred Plus (Kinray),Nite-Time Cold and Flu,S66922A,\"Laceration of unspecified muscle, fascia and tendon at wrist and hand level, left hand, initial encounter\"\n" +
            "307,\"ALK-Abello, Inc.\",ASPERGILLUS FUMIGATUS,S1224XD,\"Type III traumatic spondylolisthesis of third cervical vertebra, subsequent encounter for fracture with routine healing\"\n" +
            "308,Procter & Gamble Manufacturing Co.,Head and Shoulders,S52254R,\"Nondisplaced comminuted fracture of shaft of ulna, right arm, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with malunion\"\n" +
            "309,Bedford Laboratories,Leucovorin Calcium,S72421Q,\"Displaced fracture of lateral condyle of right femur, subsequent encounter for open fracture type I or II with malunion\"\n" +
            "310,Gurwitch Products,Laura Mercier Tinted Moisturizer SPF 20 NUDE,S72352B,\"Displaced comminuted fracture of shaft of left femur, initial encounter for open fracture type I or II\"\n" +
            "311,\"Exact-Rx, Inc.\",Urea,S66195A,\"Other injury of flexor muscle, fascia and tendon of left ring finger at wrist and hand level, initial encounter\"\n" +
            "312,L'Oreal USA Products Inc,SkinCeuticals Ultimate UV Defense Broad Spectrum SPF 30 Sunscreen,E10341,Type 1 diabetes mellitus with severe nonproliferative diabetic retinopathy with macular edema\n" +
            "313,\"Antigen Laboratories, Inc.\",Desert Sage,F529,Unspecified sexual dysfunction not due to a substance or known physiological condition\n" +
            "314,\"Johnson & Johnson Consumer Products Company, Division of Johnson & Johnson Consumer Companies, Inc.\",Aveeno Natural Protection Sunscreen,S52363B,\"Displaced segmental fracture of shaft of radius, unspecified arm, initial encounter for open fracture type I or II\"\n" +
            "315,\"Nelco Laboratories, Inc.\",Groundsel,S82142M,\"Displaced bicondylar fracture of left tibia, subsequent encounter for open fracture type I or II with nonunion\"\n" +
            "316,Major Pharmaceuticals,Promethazine Hydrochloride,S65503S,\"Unspecified injury of blood vessel of left middle finger, sequela\"\n" +
            "317,Uriel Pharmacy Inc.,Vesica fellea Ferrum 17/20 Special Order,O2600,\"Excessive weight gain in pregnancy, unspecified trimester\"\n" +
            "318,McKesson,Sunmark Aspirin,M8584,\"Other specified disorders of bone density and structure, hand\"\n" +
            "319,Conopco Inc. d/b/a Unilever,Clear,E083593,\"Diabetes mellitus due to underlying condition with proliferative diabetic retinopathy without macular edema, bilateral\"\n" +
            "320,\"Ventura Corporation (San Juan, P.R)\",ESIKA,T43503S,\"Poisoning by unspecified antipsychotics and neuroleptics, assault, sequela\"\n" +
            "321,Universal Distribution Center LLC,Isopropyl Rubbing Alcohol 50%,C188,Malignant neoplasm of overlapping sites of colon\n" +
            "322,Richmond Division of Wyeth,ROBITUSSIN PEAK COLD MAXIMUM STRENGTH COUGH PLUS CHEST CONGESTION DM,S49149P,\"Salter-Harris Type IV physeal fracture of lower end of humerus, unspecified arm, subsequent encounter for fracture with malunion\"\n" +
            "323,\"Nelco Laboratories, Inc.\",Penicillium notatum,S83289S,\"Other tear of lateral meniscus, current injury, unspecified knee, sequela\"\n" +
            "324,Contract Pharmacy Services-PA,ACETAMINOPHEN AND CODEINE PHOSPHATE,O29012,\"Aspiration pneumonitis due to anesthesia during pregnancy, second trimester\"\n" +
            "325,Aidarex Pharmaceuticals LLC,AZITHROMYCIN,T24592A,\"Corrosion of first degree of multiple sites of left lower limb, except ankle and foot, initial encounter\"\n" +
            "326,BCM Cosmetique SAS,No7 Soft and Sheer Tinted Moisturiser Fair,O41123,\"Chorioamnionitis, third trimester\"\n" +
            "327,\"Vivier Pharma, Inc.\",SkinTx Sunscreen,T451X4,\"Poisoning by antineoplastic and immunosuppressive drugs, undetermined\"\n" +
            "328,Proficient Rx LP,Methocarbamol,S3983XS,\"Other specified injuries of pelvis, sequela\"\n" +
            "329,REMEDYREPACK INC.,Tramadal Hydrochloride and Acetaminophen,T404X4D,\"Poisoning by other synthetic narcotics, undetermined, subsequent encounter\"\n" +
            "330,Supervalu Inc,Equaline Tussin Mucus and Chest Congestion,S42432G,\"Displaced fracture (avulsion) of lateral epicondyle of left humerus, subsequent encounter for fracture with delayed healing\"\n" +
            "331,Kroger Company,Lice Complete Kit,S73192A,\"Other sprain of left hip, initial encounter\"\n" +
            "332,\"PD-Rx Pharmaceuticals, Inc.\",ZALEPLON,Y9222,Religious institution as the place of occurrence of the external cause\n" +
            "333,Actavis Kadian LLC,Kadian,S82873M,\"Displaced pilon fracture of unspecified tibia, subsequent encounter for open fracture type I or II with nonunion\"\n" +
            "334,DZA BRANDS LLC,HOME 360,T23419D,\"Corrosion of unspecified degree of unspecified thumb (nail), subsequent encounter\"\n" +
            "335,KAISER FOUNDATION HOSPITALS,Alprazolam,S85399,\"Other specified injury of greater saphenous vein at lower leg level, unspecified leg\"\n" +
            "336,\"Dr. Fresh, Inc.\",Binaca Fluoride Anticavity Mouthwash,T23041S,\"Burn of unspecified degree of multiple right fingers (nail), including thumb, sequela\"\n" +
            "337,\"Johnson & Johnson Consumer Products Company, Division of Johnson & Johnson Consumer Companies, Inc.\",Aveeno Protect Plus Hydrate Sunscreen,T24721D,\"Corrosion of third degree of right knee, subsequent encounter\"\n" +
            "338,AbbVie Inc.,Tarka,T81593A,\"Other complications of foreign body accidentally left in body following injection or immunization, initial encounter\"\n" +
            "339,\"Ningbo Pulisi Daily Chemical Products Co.,Ltd.\",meijer kids,T85635S,\"Leakage of other nervous system device, implant or graft, sequela\"\n" +
            "340,Aidarex Pharmaceuticals LLC,Naproxen,T22661D,\"Corrosion of second degree of right scapular region, subsequent encounter\"\n" +
            "341,TAGI Pharma Inc.,Benzoyl Peroxide Emollient,V357XXD,\"Person on outside of three-wheeled motor vehicle injured in collision with railway train or railway vehicle in traffic accident, subsequent encounter\"\n" +
            "342,Mylan Pharmaceuticals Inc.,Lamotrigine,D2932,Benign neoplasm of left epididymis\n" +
            "343,Empack Spraytech Inc.,SUNZONE FAMILY SPF 60,E093542,\"Drug or chemical induced diabetes mellitus with proliferative diabetic retinopathy with combined traction retinal detachment and rhegmatogenous retinal detachment, left eye\"\n" +
            "344,Revamp International Pte. Ltd.,PHS Hair Science Fem Hair Loss Tonic,S82144B,\"Nondisplaced bicondylar fracture of right tibia, initial encounter for open fracture type I or II\"\n" +
            "345,\"Physicians Total Care, Inc.\",Menest,W313XXA,\"Contact with prime movers, initial encounter\"\n" +
            "346,KAISER FOUNDATION HOSPITALS,Mirtazapine,V551XXA,\"Passenger in pick-up truck or van injured in collision with railway train or railway vehicle in nontraffic accident, initial encounter\"\n" +
            "347,\"General Injectables & Vaccines, Inc\",Ampicillin,R878,Other abnormal findings in specimens from female genital organs\n" +
            "348,STAT Rx USA LLC,AMOXICILLIN AND CLAVULANATE POTASSIUM,T361X4,\"Poisoning by cephalosporins and other beta-lactam antibiotics, undetermined\"\n" +
            "349,\"Seyer Pharmatec, Inc.\",Panatuss PED,S52354P,\"Nondisplaced comminuted fracture of shaft of radius, right arm, subsequent encounter for closed fracture with malunion\"\n" +
            "350,Paramesh Banerji Life Sciences LLC,Alpan 40 (Number 110),S60512A,\"Abrasion of left hand, initial encounter\"\n" +
            "351,Chain Drug Marketing Association Inc.,ACID REDUCER,S82426C,\"Nondisplaced transverse fracture of shaft of unspecified fibula, initial encounter for open fracture type IIIA, IIIB, or IIIC\"\n" +
            "352,Meijer Distribution Inc,ibuprofen,T1792,\"Food in respiratory tract, part unspecified\"\n" +
            "353,\"Energique, Inc.\",Rescue 5,I720,Aneurysm of carotid artery\n" +
            "354,\"Aphena Pharma Solutions - Tennessee, Inc.\",COUMADIN,S72392D,\"Other fracture of shaft of left femur, subsequent encounter for closed fracture with routine healing\"\n" +
            "355,Family Dollar,Ibuprofen IB,V8602,Driver of snowmobile injured in traffic accident\n" +
            "356,\"Nelco Laboratories, Inc.\",Russian Thistle,M13172,\"Monoarthritis, not elsewhere classified, left ankle and foot\"\n" +
            "357,Eli Lilly and Company,Strattera,M8970,\"Major osseous defect, unspecified site\"\n" +
            "358,\"ProPhase Labs, Inc.\",Organix Complete,S80812D,\"Abrasion, left lower leg, subsequent encounter\"\n" +
            "359,DIRECT RX,TRAMADOL HYDROCHLORIDE,H5936,Postprocedural seroma of eye and adnexa following other procedure\n" +
            "360,Pfizer Laboratories Div Pfizer Inc.,Gemcitabine Hydrochloride,S56108A,\"Unspecified injury of flexor muscle, fascia and tendon of left little finger at forearm level, initial encounter\"\n" +
            "361,Eli Lilly and Company,Strattera,S30821D,\"Blister (nonthermal) of abdominal wall, subsequent encounter\"\n" +
            "362,Henry Schein Inc.,LIDOCAINE,T8629,Other complications of heart transplant\n" +
            "363,\"Aphena Pharma Solutions - Tennessee, LLC\",Bisacodyl,S45312D,\"Laceration of superficial vein at shoulder and upper arm level, left arm, subsequent encounter\"\n" +
            "364,Hyland's,PULSATILLA NIG,S42134K,\"Nondisplaced fracture of coracoid process, right shoulder, subsequent encounter for fracture with nonunion\"\n" +
            "365,U.S. Pharmaceuticals,Viagra,S52132E,\"Displaced fracture of neck of left radius, subsequent encounter for open fracture type I or II with routine healing\"\n" +
            "366,Celgene Corporation,ISTODAX,M85632,\"Other cyst of bone, left forearm\"\n" +
            "367,Aurobindo Pharma Limited,Atenolol,R0683,Snoring\n" +
            "368,Kao Brands Company,Ban,T82525A,\"Displacement of umbrella device, initial encounter\"\n" +
            "369,Aurobindo Pharma Limited,Ciprofloxacin,W5922XS,\"Struck by turtle, sequela\"\n" +
            "370,\"Aphena Pharma Solutions - Tennessee, LLC\",GABAPENTIN,T2062XS,\"Corrosion of second degree of lip(s), sequela\"\n" +
            "371,DIRECT RX,TOPIRAMATE,T50A94D,\"Poisoning by other bacterial vaccines, undetermined, subsequent encounter\"\n" +
            "372,\"Trigen Laboratories, LLC\",hydrocodone bitartrate and acetaminophen,S0184,Puncture wound with foreign body of other part of head\n" +
            "373,\"AMO Hangzhou Co., LTD\",blink tears,S82034C,\"Nondisplaced transverse fracture of right patella, initial encounter for open fracture type IIIA, IIIB, or IIIC\"\n" +
            "374,Meijer Distribution Inc,24 hour allergy,H53011,\"Deprivation amblyopia, right eye\"\n" +
            "375,3M Health Care,3M Cavilon Durable Barrier Fragrance Free,S3339XS,\"Dislocation of other parts of lumbar spine and pelvis, sequela\"\n" +
            "376,\"Fenwal, Inc.\",ADSOL Red Cell Preservation Solution System in Plastic Container (PL 146 Plastic),S41159S,\"Open bite of unspecified upper arm, sequela\"\n" +
            "377,New Sun Inc.,Allergies Foundational Formula,M89251,\"Other disorders of bone development and growth, right femur\"\n" +
            "378,CARDINAL HEALTH,LEADER TRIPLE ANTIBIOTIC,S8266,Nondisplaced fracture of lateral malleolus of unspecified fibula\n" +
            "379,Procter & Gamble Manufacturing Company,Secret Outlast Clear,L439,\"Lichen planus, unspecified\"\n" +
            "380,Noxell,Covergirl Outlast Stay Fabulous 3in1 Foundation,S31131S,\"Puncture wound of abdominal wall without foreign body, left upper quadrant without penetration into peritoneal cavity, sequela\"\n" +
            "381,Hyland's,IPECACUANHA,H35072,\"Retinal telangiectasis, left eye\"\n" +
            "382,\"ALK-Abello, Inc.\",OAT,C300,Malignant neoplasm of nasal cavity\n" +
            "383,Ventura International LTD,LBEL Couleur luxe rouge irresistible maximum hydration SPF 17,S82099R,\"Other fracture of unspecified patella, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with malunion\"\n" +
            "384,\"SJ Creations, Inc.\",Avocado Lime Antibacterial Foaming Hand Wash,S79002P,\"Unspecified physeal fracture of upper end of left femur, subsequent encounter for fracture with malunion\"\n" +
            "385,\"Ventura Corporation, Ltd.\",ESIKA,D412,Neoplasm of uncertain behavior of ureter\n" +
            "386,\"Allergy Laboratories, Inc.\",GIANT RAGWEED POLLEN,P0500,\"Newborn light for gestational age, unspecified weight\"\n" +
            "387,\"Paddock Laboratories, Inc.\",OPIUM TINCTURE DEODORIZED,S72102K,\"Unspecified trochanteric fracture of left femur, subsequent encounter for closed fracture with nonunion\"\n" +
            "388,Neutrogena Corporation,Neutrogena Ultra Sheer Body Mist,M85069,\"Fibrous dysplasia (monostotic), unspecified lower leg\"\n" +
            "389,\"Cosmetics Institute Technology Co., Ltd.\",BIOXIDEA ELEMENT 48 NATURA DIAMOND MASK,O0952,Supervision of elderly multigravida\n" +
            "390,Natural Health Supply,Skin Eruptions Cough,S7410XS,\"Injury of femoral nerve at hip and thigh level, unspecified leg, sequela\"\n" +
            "391,\"Oak Pharmaceuticals, Inc. (Subsidiary of Akorn, Inc.)\",Sodium Diuril,H11439,\"Conjunctival hyperemia, unspecified eye\"\n" +
            "392,Endo Pharmaceuticals,OPANA,S72144H,\"Nondisplaced intertrochanteric fracture of right femur, subsequent encounter for open fracture type I or II with delayed healing\"\n" +
            "393,Cardinal Health,Niaspan,S60472,Other superficial bite of right middle finger\n" +
            "394,TARGET Corporation,WOMENS LAXATIVE,S12112A,\"Nondisplaced Type II dens fracture, initial encounter for closed fracture\"\n" +
            "395,\"Deseret Biologicals, Inc\",Pertussis,M6104,\"Myositis ossificans traumatica, hand\"\n" +
            "396,\"American Regent, Inc.\",Magnesium Chloride,S63233A,\"Subluxation of proximal interphalangeal joint of left middle finger, initial encounter\"\n" +
            "397,Walgreen Company,Wal itin,T23411,Corrosion of unspecified degree of right thumb (nail)\n" +
            "398,\"Antigen Laboratories, Inc.\",Washington/Oregon Inland Weed Mixture,S020XXS,\"Fracture of vault of skull, sequela\"\n" +
            "399,\"JUBILANT CADISTA PHARMACEUTICALS, INC.\",Methylprednisolone,H02432,Paralytic ptosis of left eyelid\n" +
            "400,Bare Escentuals Beauty Inc.,BareMinerals Golden Medium matte,S0211FS,\"Type III occipital condyle fracture, left side, sequela\"\n" +
            "401,Carilion Materials Management,Irbesartan,S46922,\"Laceration of unspecified muscle, fascia and tendon at shoulder and upper arm level, left arm\"\n" +
            "402,\"PACK Pharmaceuticals, LLC\",Diclofenac Sodium,S52356H,\"Nondisplaced comminuted fracture of shaft of radius, unspecified arm, subsequent encounter for open fracture type I or II with delayed healing\"\n" +
            "403,Nordan Smith Welding Supply,Oxygen,V347XXA,\"Person on outside of three-wheeled motor vehicle injured in collision with heavy transport vehicle or bus in traffic accident, initial encounter\"\n" +
            "404,\"Physicians Total Care, Inc.\",MEDROXYPROGESTERONE ACETATE,I9789,\"Other postprocedural complications and disorders of the circulatory system, not elsewhere classified\"\n" +
            "405,\"PD-Rx Pharmaceuticals, Inc.\",Levofloxacin,S34124A,\"Incomplete lesion of L4 level of lumbar spinal cord, initial encounter\"\n" +
            "406,Clinical Solutions Wholesale,Diphenhydramine Hydrochloride,M25511,Pain in right shoulder\n" +
            "407,\"Physicians Total Care, Inc.\",Desoximetasone,Y92020,Kitchen in mobile home as the place of occurrence of the external cause\n" +
            "408,Cardinal Health,Lisinopril,S90446A,\"External constriction, unspecified lesser toe(s), initial encounter\"\n" +
            "409,Canadian Custom Packaging Company,HealthCare,V351XXD,\"Passenger in three-wheeled motor vehicle injured in collision with railway train or railway vehicle in nontraffic accident, subsequent encounter\"\n" +
            "410,\"Forest laboratories, Inc.\",Bystolic,N5233,Erectile dysfunction following urethral surgery\n" +
            "411,Insight Pharmaceuticals,Boil Ease,Q5322,\"Ectopic perineal testis, bilateral\"\n" +
            "412,\"Energique, Inc.\",Sinuchron,V9085XD,\"Drowning and submersion due to other accident to canoe or kayak, subsequent encounter\"\n" +
            "413,Linde Eckstein GmbH + Co. KG,Beautipharm Body Moisturizer,R97,Abnormal tumor markers\n" +
            "414,Sandoz Inc,Ampicillin and Sulbactam,T79A12D,\"Traumatic compartment syndrome of left upper extremity, subsequent encounter\"\n" +
            "415,\"SJ Creations, Inc.\",Mango Spice Antibacterial Foaming Handwash,T84110S,\"Breakdown (mechanical) of internal fixation device of right humerus, sequela\"\n" +
            "416,\"Antigen Laboratories, Inc.\",Cattail,I518,Other ill-defined heart diseases\n" +
            "417,\"Physicians Total Care, Inc.\",Cozaar,S22071K,\"Stable burst fracture of T9-T10 vertebra, subsequent encounter for fracture with nonunion\"\n" +
            "418,\"General Injectables & Vaccines, Inc\",Xylocaine,S92323G,\"Displaced fracture of second metatarsal bone, unspecified foot, subsequent encounter for fracture with delayed healing\"\n" +
            "419,HOMEOLAB USA INC.,EUCALYPTUS GLOBULUS,H0524,Constant exophthalmos\n" +
            "420,\"Nelco Laboratories, Inc.\",Aspergillus repens,H53031,\"Strabismic amblyopia, right eye\"\n" +
            "421,Air Liquide America Specialty Gases LLC,NITROGEN,K50019,Crohn's disease of small intestine with unspecified complications\n" +
            "422,\"Advanced Vision Research (Subsidiary of Akorn, Inc.)\",TheraTears Lubricant,T8462,Infection and inflammatory reaction due to internal fixation device of leg\n" +
            "423,\"Newton Laboratories, Inc.\",Gas - Indigestion,T81710D,\"Complication of mesenteric artery following a procedure, not elsewhere classified, subsequent encounter\"\n" +
            "424,Meijer Distribution Inc.,Meijer Elements Long-Lasting Oil-Free,W899XXS,\"Exposure to unspecified man-made visible and ultraviolet light, sequela\"\n" +
            "425,\"Allergy Laboratories, Inc.\",BEEF,S52699E,\"Other fracture of lower end of unspecified ulna, subsequent encounter for open fracture type I or II with routine healing\"\n" +
            "426,\"Safetec of America, Inc.\",Pain Relief,K08494,\"Partial loss of teeth due to other specified cause, class IV\"\n" +
            "427,\"Santarus, Inc.\",Glumetza,P027,Newborn affected by chorioamnionitis\n" +
            "428,McKesson Packaging Services a business unit of McKesson Corporation,Risperidone,V731XXA,\"Passenger on bus injured in collision with car, pick-up truck or van in nontraffic accident, initial encounter\"\n" +
            "429,Clinical Solutions Wholesale,Metformin hydrochloride,S86192A,\"Other injury of other muscle(s) and tendon(s) of posterior muscle group at lower leg level, left leg, initial encounter\"\n" +
            "430,\"Teva Parenteral Medicines, Inc\",mitoXANTRONE,S62331D,\"Displaced fracture of neck of second metacarpal bone, left hand, subsequent encounter for fracture with routine healing\"\n" +
            "431,Natural Health Supply,Sore Throat headache,T83591D,\"Infection and inflammatory reaction due to implanted urinary sphincter, subsequent encounter\"\n" +
            "432,\"WOONSOCKET PRESCRIPTION CENTER,INCORPORATED\",Gentle Laxative,N4340,\"Spermatocele of epididymis, unspecified\"\n" +
            "433,\"Nelco Laboratories, Inc.\",Cocklebur,S42019D,\"Nondisplaced fracture of sternal end of unspecified clavicle, subsequent encounter for fracture with routine healing\"\n" +
            "434,\"Allergy Laboratories, Inc.\",RED ALDER POLLEN,H35383,\"Toxic maculopathy, bilateral\"\n" +
            "435,NASH-FINCH COMPANY,Allergy Complete Relief,S56322D,\"Laceration of extensor or abductor muscles, fascia and tendons of left thumb at forearm level, subsequent encounter\"\n" +
            "436,\"Prestige Brands Holdings, Inc.\",Chloraseptic Warming Sore Throat,H25041,\"Posterior subcapsular polar age-related cataract, right eye\"\n" +
            "437,Mylan Pharmaceuticals Inc.,Amitriptyline Hydrochloride,Z448,Encounter for fitting and adjustment of other external prosthetic devices\n" +
            "438,State of Florida DOH Central Pharmacy,Dicyclomine Hydrochloride,S83279S,\"Complex tear of lateral meniscus, current injury, unspecified knee, sequela\"\n" +
            "439,Northstar RxLLC,Atenolol,S25391D,\"Other specified injury of right innominate or subclavian vein, subsequent encounter\"\n" +
            "440,\"Preferred Pharmaceuticals, Inc.\",ENALAPRIL MALEATE,X398XXA,\"Other exposure to forces of nature, initial encounter\"\n" +
            "441,Lake Erie Medical DBA Quality Care Products LLC,Levofloxacin,S061X8,Traumatic cerebral edema with loss of consciousness of any duration with death due to other cause prior to regaining consciousness\n" +
            "442,\"WH Nutritionals, LLC\",HemeNatal OB,T43631S,\"Poisoning by methylphenidate, accidental (unintentional), sequela\"\n" +
            "443,Reckitt Benckiser LLC,Clearasil Daily Clear,M8435,\"Stress fracture, pelvis and femur\"\n" +
            "444,Exelan Pharmaceuticals Inc.,CITALOPRAM HYDROBROMIDE,S629,Unspecified fracture of wrist and hand\n" +
            "445,MineralBio,Dr MINERAL Anti-Itch,S82234D,\"Nondisplaced oblique fracture of shaft of right tibia, subsequent encounter for closed fracture with routine healing\"\n" +
            "446,\"Avon Products, Inc\",Anew Reversalist,M1A47,\"Other secondary chronic gout, ankle and foot\"\n" +
            "447,\"A&Z Pharmaceutical, Inc.\",Acetaminophen Phenylephrine HCl,L660,Pseudopelade\n" +
            "448,\"Antigen Laboratories, Inc.\",Treatment Set TS128873,S00462S,\"Insect bite (nonvenomous) of left ear, sequela\"\n" +
            "449,Mirror Pharmaceuticals LLC,\"Butalbital, Acetaminophen, and Caffeine\",S52299P,\"Other fracture of shaft of unspecified ulna, subsequent encounter for closed fracture with malunion\"\n" +
            "450,Uriel Pharmacy Inc.,Olivenite 6 Special Order,F18221,Inhalant dependence with intoxication delirium\n" +
            "451,Mylan Pharmaceuticals Inc.,Dicyclomine Hydrochloride,S9104,Puncture wound with foreign body of ankle\n" +
            "452,\"Premier Value (Chain Drug Consortium, LLC)\",Childrens Plus Cough and Runny Nose,M67842,\"Other specified disorders of synovium, left hand\"\n" +
            "453,\"Dispensing Solutions, Inc.\",ONDANSETRON HYDROCHLORIDE,W499XXA,\"Exposure to other inanimate mechanical forces, initial encounter\"\n" +
            "454,Mylan Institutional Inc.,Venlafaxine Hydrochloride,S82201H,\"Unspecified fracture of shaft of right tibia, subsequent encounter for open fracture type I or II with delayed healing\"\n" +
            "455,\"Caraco Pharma, Inc.\",Flumadine,S36893S,\"Laceration of other intra-abdominal organs, sequela\"\n" +
            "456,\"ALK-Abello, Inc.\",SORGHUM HALEPENSE POLLEN,S72066,Nondisplaced articular fracture of head of unspecified femur\n" +
            "457,Cardinal Health,LEADER ALL DAY ALLERGY,E063,Autoimmune thyroiditis\n" +
            "458,\"H and P Industries, Inc. dba Triad Group\",OB Towelette,S72134N,\"Nondisplaced apophyseal fracture of right femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with nonunion\"\n" +
            "459,\"Zhejiang Blue Dream Cosmetics Co., Ltd.\",Sweet Candy Kiss Sanitizer Pen,Z52811,\"Egg (Oocyte) donor under age 35, designated recipient\"\n" +
            "460,Rite Aid Corporation,renewal for men,V8669,Passenger of other special all-terrain or other off-road motor vehicle injured in nontraffic accident\n" +
            "461,Keltman Pharmaceuticals Inc.,CELEBREX,S82016M,\"Nondisplaced osteochondral fracture of unspecified patella, subsequent encounter for open fracture type I or II with nonunion\"\n" +
            "462,\"General Injectables & Vaccines, Inc.\",Metoclopramide,H7091,\"Unspecified mastoiditis, right ear\"\n" +
            "463,\"TWIN MED, LLC\",procure,F5002,\"Anorexia nervosa, binge eating/purging type\"\n" +
            "464,\"EMD Serono, Inc.\",Gonal-f RFF Redi-ject,S82864D,\"Nondisplaced Maisonneuve's fracture of right leg, subsequent encounter for closed fracture with routine healing\"\n" +
            "465,Laboratoires dermo Cosmetik Inc,GMC Medical,S42331K,\"Displaced oblique fracture of shaft of humerus, right arm, subsequent encounter for fracture with nonunion\"\n" +
            "466,Baxter Healthcare Corporation,TISSEEL,F5119,Other hypersomnia not due to a substance or known physiological condition\n" +
            "467,\"Aphena Pharma Solutions - Tennessee, LLC\",Nortriptyline Hydrochloride,Y35192S,\"Legal intervention involving other explosives, bystander injured, sequela\"\n" +
            "468,\"Physicians Total Care, Inc.\",Ampicillin,M10332,\"Gout due to renal impairment, left wrist\"\n" +
            "469,\"AvKARE, Inc.\",Benazepril Hydrochloride,P0089,Newborn affected by other maternal conditions\n" +
            "470,ARMY AND AIR FORCE EXCHANGE SERVICE,Exchange Select Dark Tanning Sunscreen,T83713A,\"Erosion of implanted urethral bulking agent to surrounding organ or tissue, initial encounter\"\n" +
            "471,Parke-Davis Div of Pfizer Inc,Nitrostat,S36232A,\"Laceration of tail of pancreas, unspecified degree, initial encounter\"\n" +
            "472,GlaxoSmithKline Consumer Healthcare LP,STANBACK,H6093,\"Unspecified otitis externa, bilateral\"\n" +
            "473,WALGREEN CO.,Mucus Relief Plus,F15921,\"Other stimulant use, unspecified with intoxication delirium\"\n" +
            "474,C.F.E.B. Sisley,SUPER CREME SOLAIRE CORPS Body sun care,L89,Pressure ulcer\n" +
            "475,Apotheca Company,Flexible,M87233,Osteonecrosis due to previous trauma of unspecified radius\n" +
            "476,\"SJ Creations, Inc.\",Antibacterial Hand Sugar Cookie,T23692A,\"Corrosion of second degree of multiple sites of left wrist and hand, initial encounter\"\n" +
            "477,Bryant Ranch Prepack,Pentazocine and naloxone,K9420,\"Gastrostomy complication, unspecified\"\n" +
            "478,Shield Line LLC,Medpride,M87245,\"Osteonecrosis due to previous trauma, left finger(s)\"\n" +
            "479,Apotex Corp.,Ropinirole,V00138S,\"Other skateboard accident, sequela\"\n" +
            "480,CVS Pharmacy,8 hour pain relief,V8011,Animal-rider injured in collision with pedestrian or animal\n" +
            "481,Sungwon Cosmetics,Miracle of the Mose Hair Bar,S25122S,\"Major laceration of left innominate or subclavian artery, sequela\"\n" +
            "482,Lake Erie Medical DBA Quality Care Products LLC,Warfarin Sodium,S53442S,\"Ulnar collateral ligament sprain of left elbow, sequela\"\n" +
            "483,Laboratoires Clarins S.A.,CLARINS Skin Illusion SPF 10 Natural Radiance Foundation Tint 104,S52361P,\"Displaced segmental fracture of shaft of radius, right arm, subsequent encounter for closed fracture with malunion\"\n" +
            "484,Unifirst First Aid Corporation,MEDI-FIRST Ibuprofen,M8963,\"Osteopathy after poliomyelitis, forearm\"\n" +
            "485,\"PD-Rx Pharmaceuticals, Inc.\",Sulfasalazine,Z859,\"Personal history of malignant neoplasm, unspecified\"\n" +
            "486,\"Lannett Company, Inc.\",Loxapine,S52283A,\"Bent bone of unspecified ulna, initial encounter for closed fracture\"\n" +
            "487,The Mentholatum Company,Softlips Pure Lip Gloss,E130,Other specified diabetes mellitus with hyperosmolarity\n" +
            "488,\"Jets, Sets, & Elephants Beauty Corp.\",Shopko Antibacterial Deep Cleansing Hand,S82291D,\"Other fracture of shaft of right tibia, subsequent encounter for closed fracture with routine healing\"\n" +
            "489,Rimmel Inc.,Moisture Renew,M775,Other enthesopathy of foot\n" +
            "490,\"ALK-Abello, Inc.\",ALTERNARIA TENUIS,S64496A,\"Injury of digital nerve of right little finger, initial encounter\"\n" +
            "491,AMERCIAN SALES COMPANY,CAREONE,S42035A,\"Nondisplaced fracture of lateral end of left clavicle, initial encounter for closed fracture\"\n" +
            "492,Hyland's,CALC PHOS,W3302XD,\"Accidental discharge of hunting rifle, subsequent encounter\"\n" +
            "493,Mission Pharmacal Company,CitraNatal 90 DHA,T63454S,\"Toxic effect of venom of hornets, undetermined, sequela\"\n" +
            "494,\"Physicians Total Care, Inc.\",Sulindac,S72423,Displaced fracture of lateral condyle of unspecified femur\n" +
            "495,Washington Homeopathic Products,Hay Fever,S82126B,\"Nondisplaced fracture of lateral condyle of unspecified tibia, initial encounter for open fracture type I or II\"\n" +
            "496,AvPAK,Acebutolol Hydrochloride,S62651D,\"Nondisplaced fracture of medial phalanx of left index finger, subsequent encounter for fracture with routine healing\"\n" +
            "497,\"Carlsbad Technology, Inc.\",Glimepiride,T420X2D,\"Poisoning by hydantoin derivatives, intentional self-harm, subsequent encounter\"\n" +
            "498,\"Humco holding Group, Inc.\",Humco Calamine,S82134D,\"Nondisplaced fracture of medial condyle of right tibia, subsequent encounter for closed fracture with routine healing\"\n" +
            "499,\"WestAir Gases & Equipment, Inc.\",Air,S3150,Unspecified open wound of unspecified external genital organs\n" +
            "500,\"Forest Laboratories, Inc.\",Celexa,V9026XA,\"Drowning and submersion due to falling or jumping from burning (nonpowered) inflatable craft, initial encounter\"\n" +
            "501,\"Antigen Laboratories, Inc.\",Treatment Set TS329197,S63222S,\"Subluxation of unspecified interphalangeal joint of right middle finger, sequela\"\n" +
            "502,\"SPIRIT PHARMACEUTICALS,LLC\",D - TIME,S53023A,\"Posterior subluxation of unspecified radial head, initial encounter\"\n" +
            "503,\"Crossing Cultures, LLC dba Goddess Garden\",GODDESS GARDEN ORGANICS Lavender Mint DAILY BROAD SPECTRUM SPF 15,S33131,Dislocation of L3/L4 lumbar vertebra\n" +
            "504,Actavis Elizabeth LLC,Oxymorphone hydrochloride,I2575,Atherosclerosis of native coronary artery of transplanted heart with angina pectoris\n" +
            "505,\"Physicians Total Care, Inc.\",Azathioprine,S8256XN,\"Nondisplaced fracture of medial malleolus of unspecified tibia, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with nonunion\"\n" +
            "506,Emeis Cosmetics Pty Ltd,Avail Lip Balm with Sunscreen,S82041G,\"Displaced comminuted fracture of right patella, subsequent encounter for closed fracture with delayed healing\"\n" +
            "507,\"Sun & Skin Care Research, LLC\",NO-AD 60 Sunscreen,S90932D,\"Unspecified superficial injury of left great toe, subsequent encounter\"\n" +
            "508,Primus Pharmaceuticals,Aloquin,S92022D,\"Displaced fracture of anterior process of left calcaneus, subsequent encounter for fracture with routine healing\"\n" +
            "509,\"RUGBY LABORATORIES, INC.\",SENEXON,S62521P,\"Displaced fracture of distal phalanx of right thumb, subsequent encounter for fracture with malunion\"\n" +
            "510,Mylan Institutional Inc.,Mycophenolic Acid,S22072A,\"Unstable burst fracture of T9-T10 vertebra, initial encounter for closed fracture\"\n" +
            "511,\"Warner Chilcott (US), LLC\",Femring,S63242,Subluxation of distal interphalangeal joint of right middle finger\n" +
            "512,\"Family Dollar Services, Inc.\",Dandruff,T6359,Toxic effect of contact with other venomous fish\n" +
            "513,Mylan Pharmaceuticals Inc.,Olanzapine,S322XXA,\"Fracture of coccyx, initial encounter for closed fracture\"\n" +
            "514,ORIGINS NATURAL RESOURCES INC,A PERFECT WORLD,S9306XA,\"Dislocation of unspecified ankle joint, initial encounter\"\n" +
            "515,\"Blue Cross Laboratories, Inc.\",Fresh PearSilk Antibacterial Foaming Hand,S66092A,\"Other specified injury of long flexor muscle, fascia and tendon of left thumb at wrist and hand level, initial encounter\"\n" +
            "516,King Bio Inc.,Regional Allergies Desert U.S.,K14,Diseases of tongue\n" +
            "517,American Sales Company,Care One Cold Multi Symptom,C15,Malignant neoplasm of esophagus\n" +
            "518,Heritage Pharmaceuticals Inc,Estradiol,S40252S,\"Superficial foreign body of left shoulder, sequela\"\n" +
            "519,State of Florida DOH Central Pharmacy,Calcium Acetate,T22752D,\"Corrosion of third degree of left shoulder, subsequent encounter\"\n" +
            "520,Eisai Inc.,Targretin,C84Z8,\"Other mature T/NK-cell lymphomas, lymph nodes of multiple sites\"\n" +
            "521,\"ALK-Abello, Inc.\",LIMA BEAN,S20412A,\"Abrasion of left back wall of thorax, initial encounter\"\n" +
            "522,Contract Pharmacy Services-PA,benztropine mesylate,M85561,\"Aneurysmal bone cyst, right lower leg\"\n" +
            "523,American Health Packaging,Loxapine,S42211G,\"Unspecified displaced fracture of surgical neck of right humerus, subsequent encounter for fracture with delayed healing\"\n" +
            "524,Chartwell Governmental and Specialty RX LLC,Doxycycline Hyclate,F1917,Other psychoactive substance abuse with psychoactive substance-induced persisting dementia\n" +
            "525,\"Newton Laboratories, Inc.\",Indigestion - Gas,M84375G,\"Stress fracture, left foot, subsequent encounter for fracture with delayed healing\"\n" +
            "526,Sun Products Corporation,Home 360 Ultra Dish Detergent Green Apple Scent,T63612A,\"Toxic effect of contact with Portugese Man-o-war, intentional self-harm, initial encounter\"\n" +
            "527,\"Nelco Laboratories, Inc.\",Geotrichum candidum,Y92111,Bathroom in children's home and orphanage as the place of occurrence of the external cause\n" +
            "528,NARS COSMETICS,NARS Pure Radiant Tinted Moisturizer,S06893D,\"Other specified intracranial injury with loss of consciousness of 1 hour to 5 hours 59 minutes, subsequent encounter\"\n" +
            "529,\"Hospira, Inc.\",Sufentanil Citrate,S71011D,\"Laceration without foreign body, right hip, subsequent encounter\"\n" +
            "530,HyVee Inc,ibuprofen,S42253S,\"Displaced fracture of greater tuberosity of unspecified humerus, sequela\"\n" +
            "531,Feelgood Health,Hive Away,T22549D,\"Corrosion of first degree of unspecified axilla, subsequent encounter\"\n" +
            "532,\"PD-Rx Pharmaceuticals, Inc.\",AZITHROMYCIN,H60313,\"Diffuse otitis externa, bilateral\"\n" +
            "533,\"Allergan, Inc.\",FML FORTE,T471X1S,\"Poisoning by other antacids and anti-gastric-secretion drugs, accidental (unintentional), sequela\"\n" +
            "534,\"ProStrakan, Inc.\",Abstral,H47631,\"Disorders of visual cortex in (due to) neoplasm, right side of brain\"\n" +
            "535,Mylan Pharmaceuticals Inc.,Terazosin Hydrochloride Anhydrous,T438X5A,\"Adverse effect of other psychotropic drugs, initial encounter\"\n" +
            "536,\"EKR Therapeutics, Inc.\",Retavase,S93326S,\"Dislocation of tarsometatarsal joint of unspecified foot, sequela\"\n" +
            "537,\"Apotheca, Inc.\",Hydrocodone Bitartrate and Acetaminophen,S72391C,\"Other fracture of shaft of right femur, initial encounter for open fracture type IIIA, IIIB, or IIIC\"\n" +
            "538,Tris Pharma Inc,Promethazine Hydrochloride and Dextromethorphan Hydrobromide,M08442,\"Pauciarticular juvenile rheumatoid arthritis, left hand\"\n" +
            "539,Eli Lilly and Company,Effient,V9381XD,\"Other injury due to other accident on board passenger ship, subsequent encounter\"\n" +
            "540,\"Stephen L. LaFrance Pharmacy, Inc.\",Laxative,V9309XS,\"Burn due to localized fire on board unspecified watercraft, sequela\"\n" +
            "541,Carilion Materials Management,Pindolol,M84369,\"Stress fracture, unspecified tibia and fibula\"\n" +
            "542,Apotheca Company,Edema-HP,S43002,Unspecified subluxation of left shoulder joint\n" +
            "543,Rebel Distributors Corp,epinephrine,S95009A,\"Unspecified injury of dorsal artery of unspecified foot, initial encounter\"\n" +
            "544,L Perrigo Company,good sense cold and allergy,Y377X0D,\"Military operations involving chemical weapons and other forms of unconventional warfare, military personnel, subsequent encounter\"\n" +
            "545,\"CUARTA DIMENSION USA, INC.\",Angel Falls Hand Sanitizer,L97312,Non-pressure chronic ulcer of right ankle with fat layer exposed\n" +
            "546,\"Dermalogica, Inc.\",Overnight Clearing,T477X1D,\"Poisoning by emetics, accidental (unintentional), subsequent encounter\"\n" +
            "547,\"Aphena Pharma Solutions - Tennessee, LLC\",Hydralazine Hydrochloride,S36532S,\"Laceration of descending [left] colon, sequela\"\n" +
            "548,McKesson Contract Packaging,Tizanidine,O411434,\"Placentitis, third trimester, fetus 4\"\n" +
            "549,\"Blenheim Pharmacal, Inc.\",Ciprofloxacin,T803,ABO incompatibility reaction due to transfusion of blood or blood products\n" +
            "550,Procter & Gamble Manufacturing Company,Vicks Alcohol Free NyQuil,L97202,Non-pressure chronic ulcer of unspecified calf with fat layer exposed\n" +
            "551,Ascend Laboratories LLC,benzonatate,M89641,\"Osteopathy after poliomyelitis, right hand\"\n" +
            "552,\"Libertas Pharma, Inc.\",Amiodarone HCl,V1920XS,\"Unspecified pedal cyclist injured in collision with unspecified motor vehicles in nontraffic accident, sequela\"\n" +
            "553,SHISEIDO AMERICA INC.,SHISEIDO RADIANT LIFTING FOUNDATION,S52232B,\"Displaced oblique fracture of shaft of left ulna, initial encounter for open fracture type I or II\"\n" +
            "554,Walgreen Company,Well at Walgreens,S93401D,\"Sprain of unspecified ligament of right ankle, subsequent encounter\"\n" +
            "555,\"Tarte, Inc\",Maracuja Miracle Foundation 12-Hour Foundation Broad Spectrum SPF 15 Sunscreen,S52133H,\"Displaced fracture of neck of unspecified radius, subsequent encounter for open fracture type I or II with delayed healing\"\n" +
            "556,\"Physicians Total Care, Inc.\",Savella,M84653P,\"Pathological fracture in other disease, unspecified femur, subsequent encounter for fracture with malunion\"\n" +
            "557,Cardinal Health,Klor-Con,T3472,Frostbite with tissue necrosis of left knee and lower leg\n" +
            "558,Alloy Oxygen & Welding Supply Co. Inc.,Oxygen,V355XXA,\"Driver of three-wheeled motor vehicle injured in collision with railway train or railway vehicle in traffic accident, initial encounter\"\n" +
            "559,Empack Spraytech Inc.,SUNZONE KIDS SPF 60,H18823,\"Corneal disorder due to contact lens, bilateral\"\n" +
            "560,W. H. Goodale Co. Inc.,Oxygen,V24,Motorcycle rider injured in collision with heavy transport vehicle or bus\n" +
            "561,Clinical Solutions Wholesale,LISINOPRIL AND HYDROCHLOROTHIAZIDE,S70929,Unspecified superficial injury of unspecified thigh\n" +
            "562,\"Rising Pharmaceuticals, Inc\",Amiloride Hydrochloride,V356XXA,\"Passenger in three-wheeled motor vehicle injured in collision with railway train or railway vehicle in traffic accident, initial encounter\"\n" +
            "563,Feelgood Health,Hive Away,V8002,Occupant of animal-drawn vehicle injured by fall from or being thrown from animal-drawn vehicle in noncollision accident\n" +
            "564,\"Native Remedies, LLC\",AgoraFear Relief,N839,\"Noninflammatory disorder of ovary, fallopian tube and broad ligament, unspecified\"\n" +
            "565,Mylan Pharmaceuticals Inc.,Citalopram,G44029,\"Chronic cluster headache, not intractable\"\n" +
            "566,Natural Health Supply,Sore Throat,M70979,\"Unspecified soft tissue disorder related to use, overuse and pressure, unspecified ankle and foot\"\n" +
            "567,SOBAEK INSAM FARMING COOPERATIVE CORPORATION,PURE RED GINSENG,M6127,\"Paralytic calcification and ossification of muscle, ankle and foot\"\n" +
            "568,\"AvKARE, Inc.\",Diltiazem Hydrochloride,O24112,\"Pre-existing type 2 diabetes mellitus, in pregnancy, second trimester\"\n" +
            "569,\"AMI Cosmetic Co.,Ltd.\",SEAWEED MEDICLEAR STEMCELL BB,J09X1,Influenza due to identified novel influenza A virus with pneumonia\n" +
            "570,Major Pharmaceuticals,Promethazine Hydrochloride,S82145M,\"Nondisplaced bicondylar fracture of left tibia, subsequent encounter for open fracture type I or II with nonunion\"\n" +
            "571,Walgreens,NICOTINE,F1192,\"Opioid use, unspecified with intoxication\"\n" +
            "572,L'Oreal USA Products Inc,Lancome Paris Star Bronzer,S99039P,\"Salter-Harris Type III physeal fracture of unspecified calcaneus, subsequent encounter for fracture with malunion\"\n" +
            "573,Aidarex Pharmaceuticals LLC,Ondansetron,N8341,Prolapse and hernia of right ovary and fallopian tube\n" +
            "574,Teva Pharmaceuticals USA Inc,Albuterol Sulfate,M80841K,\"Other osteoporosis with current pathological fracture, right hand, subsequent encounter for fracture with nonunion\"\n" +
            "575,Enchante Accessories,Orange Spice Scented Antibacterial Hand Sanitizer,S06815A,\"Injury of right internal carotid artery, intracranial portion, not elsewhere classified with loss of consciousness greater than 24 hours with return to pre-existing conscious level, initial encounter\"\n" +
            "576,\"CCA Industries, Inc.\",SOLAR SENSE CLEAR ZINC SUNSCREEN Baby Tear Free FACE and BODY BROAD SPECTRUM SPF 50 PLUS,T464X1A,\"Poisoning by angiotensin-converting-enzyme inhibitors, accidental (unintentional), initial encounter\"\n" +
            "577,CC Medical Devices Inc,Arneu,S95812D,\"Laceration of other blood vessels at ankle and foot level, left leg, subsequent encounter\"\n" +
            "578,Greenstone LLC,Penicillin V Potassium,O29212,\"Cerebral anoxia due to anesthesia during pregnancy, second trimester\"\n" +
            "579,Lake Erie Medical & Surgical Supply DBA Quality Care Products LLC,Nitrofurantoin Macrocrystals,S90442A,\"External constriction, left great toe, initial encounter\"\n" +
            "580,Actavis Elizabeth LLC,Morphine sulfate,M05032,\"Felty's syndrome, left wrist\"\n" +
            "581,\"Dispensing Solutions, Inc.\",Diovan HCT,V9109,Burn due to unspecified watercraft on fire\n" +
            "582,Ventura Corporation LTD,LBEL NATURAL FINISH MOISTURIZING FOUNDATION SPF 25,S82031E,\"Displaced transverse fracture of right patella, subsequent encounter for open fracture type I or II with routine healing\"\n" +
            "583,\"Hospira, Inc\",Ampicillin and Sulbactam,S348XXA,\"Injury of other nerves at abdomen, lower back and pelvis level, initial encounter\"\n" +
            "584,Sun Pharma Global FZE,Cetirizine Hydrochloride,S21309,Unspecified open wound of unspecified front wall of thorax with penetration into thoracic cavity\n" +
            "585,\"Nelco Laboratories, Inc.\",Buckwheat Grain,S63272D,\"Dislocation of unspecified interphalangeal joint of right middle finger, subsequent encounter\"\n" +
            "586,\"Vitaltiy Works, Inc.\",Sore Muscle and Joint Relief,S63697S,\"Other sprain of left little finger, sequela\"\n" +
            "587,Kmart Corporation,Smart Sense sinus relief,V212XXS,\"Unspecified motorcycle rider injured in collision with pedal cycle in nontraffic accident, sequela\"\n" +
            "588,\"Cypress Pharmaceutical, Inc.\",Stannous Fluoride,S72324,Nondisplaced transverse fracture of shaft of right femur\n" +
            "589,\"ABC Compounding Co., Inc.\",Fast,T50B13A,\"Poisoning by smallpox vaccines, assault, initial encounter\"\n" +
            "590,\"Antigen Laboratories, Inc.\",Blackberry,S52255C,\"Nondisplaced comminuted fracture of shaft of ulna, left arm, initial encounter for open fracture type IIIA, IIIB, or IIIC\"\n" +
            "591,\"SKINFOOD CO., LTD.\",CACTUS WHITENING SUN,V382XXS,\"Person on outside of three-wheeled motor vehicle injured in noncollision transport accident in nontraffic accident, sequela\"\n" +
            "592,\"AvKARE, Inc.\",Cetirizine Hydrochloride,S2610XS,\"Unspecified injury of heart without hemopericardium, sequela\"\n" +
            "593,\"Wyeth Pharmaceutical Division of Wyeth Holdings Corporation, a subsidiary of Pfizer Inc.\",FIBERCON,M7131,\"Other bursal cyst, shoulder\"\n" +
            "594,SHISEIDO AMERICAS CORPORATION,SHISEIDO UV PROTECTIVE COMPACT (REFILL),S13110D,\"Subluxation of C0/C1 cervical vertebrae, subsequent encounter\"\n" +
            "595,McKesson Medical-Surgical Inc.,Anti-Perspirant Deodorant,V808,Animal-rider or occupant of animal-drawn vehicle injured in collision with fixed or stationary object\n" +
            "596,Wockhardt Limited,Octreotide acetate,Z947,Corneal transplant status\n" +
            "597,\"FRED'S, INC.\",Non-Drowsy Sinus Congestion and Pain,W500XXA,\"Accidental hit or strike by another person, initial encounter\"\n" +
            "598,Genzyme Corporation,Lumizyme,H3343,\"Traction detachment of retina, bilateral\"\n" +
            "599,Reckitt Benckiser LLC,Cepacol,E1069,Type 1 diabetes mellitus with other specified complication\n" +
            "600,Family Dollar,Multi-Symptom Menstrual Pain Relief,M85052,\"Fibrous dysplasia (monostotic), left thigh\"\n" +
            "601,GlaxoSmithKline LLC,LANOXIN,S82231H,\"Displaced oblique fracture of shaft of right tibia, subsequent encounter for open fracture type I or II with delayed healing\"\n" +
            "602,\"Merle Norman Cosmetics, Inc\",Ivory Perfecting Makeup Broad Spectrum SPF 25,M67834,\"Other specified disorders of tendon, left wrist\"\n" +
            "603,Valeant Pharmaceuticals North America LLC,Prostigmin,S63637A,\"Sprain of interphalangeal joint of left little finger, initial encounter\"\n" +
            "604,\"Vitality Works, Inc.\",Olive Leaf Nasal,S02630,\"Fracture of coronoid process of mandible, unspecified side\"\n" +
            "605,REMEDYREPACK INC.,Lisinopril,S802,Other superficial injuries of knee\n" +
            "606,Cadila Healthcare Limited,buspirone hydrochloride,V9512XA,\"Forced landing of ultralight, microlight or powered-glider injuring occupant, initial encounter\"\n" +
            "607,HOMEOLAB USA INC.,CONSTIPATION RELIEF,M6622,\"Spontaneous rupture of extensor tendons, upper arm\"\n" +
            "608,\"Nelco Laboratories, Inc.\",Chicken Feathers,S63101A,\"Unspecified subluxation of right thumb, initial encounter\"\n" +
            "609,Cadila Healthcare Limited,Ranitidine Hydrochloride,S72031Q,\"Displaced midcervical fracture of right femur, subsequent encounter for open fracture type I or II with malunion\"\n" +
            "610,B. Braun Medical Inc.,Glycine,O401XX5,\"Polyhydramnios, first trimester, fetus 5\"\n" +
            "611,CVS Pharmacy,loperamide hydrochloride,T871,Complications of reattached (part of) lower extremity\n" +
            "612,\"Antigen Laboratories, Inc.\",Mustard Greens,S66101A,\"Unspecified injury of flexor muscle, fascia and tendon of left index finger at wrist and hand level, initial encounter\"\n" +
            "613,\"Physicians Total Care, Inc.\",AVAPRO,D8989,\"Other specified disorders involving the immune mechanism, not elsewhere classified\"\n" +
            "614,American Health Packaging,Carbidopa and Levodopa,I69369,Other paralytic syndrome following cerebral infarction affecting unspecified side\n" +
            "615,L Perrigo Company,Good Sense all day allergy,S00269S,\"Insect bite (nonvenomous) of unspecified eyelid and periocular area, sequela\"\n" +
            "616,West-ward Pharmaceutical Corp,Amoxicillin,S161XXS,\"Strain of muscle, fascia and tendon at neck level, sequela\"\n" +
            "617,Rebel Distributors Corp,Miconazole Nitrate,V9615,Hang-glider explosion injuring occupant\n" +
            "618,\"ABLE C&C CO., LTD.\",MISSHA SIGNATURE COMPLEXION COORDINATING BB,S82256R,\"Nondisplaced comminuted fracture of shaft of unspecified tibia, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with malunion\"\n" +
            "619,Western Family Foods Inc,childrens pain relief,S37001,Unspecified injury of right kidney\n" +
            "620,The Wellness Center,MBM 11 Thyroid Adrenal,S52399K,\"Other fracture of shaft of radius, unspecified arm, subsequent encounter for closed fracture with nonunion\"\n" +
            "621,Carilion Materials Management,Colestipol Hydrochloride,K5000,Crohn's disease of small intestine without complications\n" +
            "622,Macoven Pharmaceuticals,Spinosad,S1194XA,\"Puncture wound with foreign body of unspecified part of neck, initial encounter\"\n" +
            "623,Jafra Cosmetics international,Sienna Always Color Stay-on Makeup Broad Spectrum SPF 15,O418X2,\"Other specified disorders of amniotic fluid and membranes, second trimester\"\n" +
            "624,\"Dispensing Solutions, Inc.\",CYCLOBENZAPRINE HYDROCHLORIDE,M4800,\"Spinal stenosis, site unspecified\"\n" +
            "625,Uriel Pharmacy Inc.,Marjoram Melissa Adult Size,S99212B,\"Salter-Harris Type I physeal fracture of phalanx of left toe, initial encounter for open fracture\"\n" +
            "626,\"Aton Pharma, Inc.\",EDECRIN,S82124K,\"Nondisplaced fracture of lateral condyle of right tibia, subsequent encounter for closed fracture with nonunion\"\n" +
            "627,\"DZA Brands, LLC\",Dry Scalp Care,S73122D,\"Ischiocapsular ligament sprain of left hip, subsequent encounter\"\n" +
            "628,\"Arbor Pharmaceuticals, Inc.\",Erythromycin,O24425,\"Gestational diabetes mellitus in childbirth, controlled by oral hypoglycemic drugs\"\n" +
            "629,\"McNeil Consumer Healthcare Div McNeil-PPC, Inc\",Motrin,S82209P,\"Unspecified fracture of shaft of unspecified tibia, subsequent encounter for closed fracture with malunion\"\n" +
            "630,Chain Drug Market Association,Instant Antiseptic Pain Relief,W275XXD,\"Contact with paper-cutter, subsequent encounter\"\n" +
            "631,Deliz Pharmaceutical Corp,TRISPEC PSE Cough Suppressant Expectorant Nasal Decongestant GRAPE Flavor,H3500,Unspecified background retinopathy\n" +
            "632,\"Alva-Amco Pharmacal Companies, Inc.\",Nauzene,M80819,\"Other osteoporosis with current pathological fracture, unspecified shoulder\"\n" +
            "633,S & S Primeline Chemical Systems,DERMA ICE BURN RELIEF with Aloe Vera,T595X3S,\"Toxic effect of fluorine gas and hydrogen fluoride, assault, sequela\"\n" +
            "634,\"SCOT-TUSSIN Pharmacal Co., Inc.\",Scot-Tussin,S35406D,\"Unspecified injury of unspecified renal vein, subsequent encounter\"\n" +
            "635,AMOREPACIFIC,AMOREPACIFIC,T566,Toxic effects of tin and its compounds\n" +
            "636,Aurobindo Pharma Limited,Divalproex Sodium,T63482S,\"Toxic effect of venom of other arthropod, intentional self-harm, sequela\"\n" +
            "637,\"Taro Pharmaceuticals U.S.A., Inc.\",Sulfacetamide Sodium,W3309XD,\"Accidental discharge of other larger firearm, subsequent encounter\"\n" +
            "638,Mylan Institutional Inc.,Fenofibric Acid,M24671,\"Ankylosis, right ankle\"\n" +
            "639,Wayne Concept Manufacturing Co Inc,BAC OFF,F16229,\"Hallucinogen dependence with intoxication, unspecified\"\n" +
            "640,HOMEOLAB USA INC.,ABIES CANADENSIS,S82041H,\"Displaced comminuted fracture of right patella, subsequent encounter for open fracture type I or II with delayed healing\"\n" +
            "641,\"Deseret Biologicals, Inc.\",Cinnamic Acid,V211XXS,\"Motorcycle passenger injured in collision with pedal cycle in nontraffic accident, sequela\"\n" +
            "642,Proficient Rx LP,Ipratropium Bromide,C641,\"Malignant neoplasm of right kidney, except renal pelvis\"\n" +
            "643,\"Antigen Laboratories, Inc.\",White Hickory,S72133K,\"Displaced apophyseal fracture of unspecified femur, subsequent encounter for closed fracture with nonunion\"\n" +
            "644,\"Physicians Total Care, Inc.\",Exelon,T23722,Corrosion of third degree of single left finger (nail) except thumb\n" +
            "645,\"Allergy Laboratories, Inc.\",RED ALDER POLLEN,S90819D,\"Abrasion, unspecified foot, subsequent encounter\"\n" +
            "646,Geri-Care Pharmaceutical Corp,stimulant laxative enteric coated,T4995XA,\"Adverse effect of unspecified topical agent, initial encounter\"\n" +
            "647,Larasan Pharmaceutical Corporation,Dr Bob Arnots Pain,V886XXA,\"Person injured in collision between railway train or railway vehicle and car, nontraffic, initial encounter\"\n" +
            "648,\"Antigen Laboratories, Inc.\",Garlic,S32452G,\"Displaced transverse fracture of left acetabulum, subsequent encounter for fracture with delayed healing\"\n" +
            "649,Hydrox Laboratories,Instant Hand Sanitizer,V380,Driver of three-wheeled motor vehicle injured in noncollision transport accident in nontraffic accident\n" +
            "650,\"Nelco Laboratories, Inc.\",Standardized Orchard Grass Pollen,T458X3S,\"Poisoning by other primarily systemic and hematological agents, assault, sequela\"\n" +
            "651,American Health Packaging,Buspirone HCl,Y36441A,\"War operations involving unarmed hand to hand combat, civilian, initial encounter\"\n" +
            "652,\"Amneal Pharmaceuticals of New York, LLC\",Nitrofurantoin,T40995A,\"Adverse effect of other psychodysleptics [hallucinogens], initial encounter\"\n" +
            "653,Baxter Healthcare Corporation,Travasol,O0981,Supervision of pregnancy resulting from assisted reproductive technology\n" +
            "654,\"Concept Laboratories, Inc.\",MyOmega,T48992D,\"Poisoning by other agents primarily acting on the respiratory system, intentional self-harm, subsequent encounter\"\n" +
            "655,GlaxoSmithKline Consumer Healthcare LP,Sominex,D758,Other specified diseases of blood and blood-forming organs\n" +
            "656,\"Johnson & Johnson Healthcare Products, Division of McNEIL-PPC, Inc.\",LISTERINE TOTAL CARE,S1983XA,\"Other specified injuries of vocal cord, initial encounter\"\n" +
            "657,Air Liquide Healthcare America Corporation,NITROUS OXIDE,C8593,\"Non-Hodgkin lymphoma, unspecified, intra-abdominal lymph nodes\"\n" +
            "658,Western Family Foods Inc,sinus and allergy,M86439,\"Chronic osteomyelitis with draining sinus, unspecified radius and ulna\"\n" +
            "659,Direct Rx,MINOCYCLINE HYDROCHLORIDE,S02640G,\"Fracture of ramus of mandible, unspecified side, subsequent encounter for fracture with delayed healing\"\n" +
            "660,AvPAK,Nifedipine,S82024J,\"Nondisplaced longitudinal fracture of right patella, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with delayed healing\"\n" +
            "661,\"Allergy Laboratories, Inc.\",LIME,D0502,Lobular carcinoma in situ of left breast\n" +
            "662,\"Healthy Accents (DZA Brands, LLC)\",Allergy Relief,S99041G,\"Salter-Harris Type IV physeal fracture of right calcaneus, subsequent encounter for fracture with delayed healing\"\n" +
            "663,Meijer Distribution Inc,Cough Syrup,S63005,Unspecified dislocation of left wrist and hand\n" +
            "664,Personal Care Products,Hand Sanitizer,S72132S,\"Displaced apophyseal fracture of left femur, sequela\"\n" +
            "665,\"Lukare Medical, LLC\",Elliotts B,M8600,\"Acute hematogenous osteomyelitis, unspecified site\"\n" +
            "666,\"APP Pharmaceuticals, LLC\",Xylocaine,V42,Car occupant injured in collision with two- or three-wheeled motor vehicle\n" +
            "667,Guerlain S.A.,SUPER AQUA-SERUM BB HYDRA BEAUTY BALM WITH SUNSCREEN BROAD SPECTRUM SPF 25 LIGHT,E7529,Other sphingolipidosis\n" +
            "668,H E B,rx act cold and allergy,V00212D,\"Ice-skater colliding with stationary object, subsequent encounter\"\n" +
            "669,\"Allermed Laboratories, Inc.\",Quackgrass Pollen,H0266,\"Xanthelasma of left eye, unspecified eyelid\"\n" +
            "670,Laboratoires Clarins S.A.,CLARINS Super Restorative Day Illuminating lifting replenishing BROAD SPECTRUM - SPF 20 - Sunscreen,S0411,\"Injury of oculomotor nerve, right side\"\n" +
            "671,\"Hawthorn Pharmaceuticals, Inc.\",Arbinoxa,S52592C,\"Other fractures of lower end of left radius, initial encounter for open fracture type IIIA, IIIB, or IIIC\"\n" +
            "672,\"NCS HealthCare of KY, Inc dba Vangard Labs\",Bupropion Hydrochloride,T5292XA,\"Toxic effect of unspecified organic solvent, intentional self-harm, initial encounter\"\n" +
            "673,Torrent Pharmaceuticals Limited,Cetirizine Hydrochloride,S89229S,\"Salter-Harris Type II physeal fracture of upper end of unspecified fibula, sequela\"\n" +
            "674,Cardinal Health,Furosemide,S89229S,\"Salter-Harris Type II physeal fracture of upper end of unspecified fibula, sequela\"\n" +
            "675,Perrigo New York Inc,antifungal,M60862,\"Other myositis, left lower leg\"\n" +
            "676,\"Allergy Laboratories, Inc.\",\"4-PINE MIX, AUSTRIAN/LOBLOLLY/SCOTCH/WHITE POLLEN\",V211XXA,\"Motorcycle passenger injured in collision with pedal cycle in nontraffic accident, initial encounter\"\n" +
            "677,Rebel Distributors Corp,Alprazolam,S55812D,\"Laceration of other blood vessels at forearm level, left arm, subsequent encounter\"\n" +
            "678,LABORATORIOS DE COSMETICA SCIENTIFICA ATACHE,Oily SK Cleansing,Y830,\"Surgical operation with transplant of whole organ as the cause of abnormal reaction of the patient, or of later complication, without mention of misadventure at the time of the procedure\"\n" +
            "679,American Health Packaging,Clindamycin hydrochloride,S23100A,\"Subluxation of unspecified thoracic vertebra, initial encounter\"\n" +
            "680,GlaxoSmithKline LLC,IMITREX,G9051,Complex regional pain syndrome I of upper limb\n" +
            "681,\"Antigen Laboratories, Inc.\",American Cockroach,M87211,\"Osteonecrosis due to previous trauma, right shoulder\"\n" +
            "682,Baxter Healthcare Corporation,CLINIMIX E,G255,Other chorea\n" +
            "683,\"Aplicare, Inc.\",Aplicare Physicians Antibacterial,F801,Expressive language disorder\n" +
            "684,\"Preferred Pharmaceuticals, Inc.\",Ofloxacin Otic,T503X4D,\"Poisoning by electrolytic, caloric and water-balance agents, undetermined, subsequent encounter\"\n" +
            "685,\"Akorn, Inc.\",Progesterone,V4352XA,\"Car driver injured in collision with other type car in traffic accident, initial encounter\"\n" +
            "686,Exchange Select,\"Mucus Relief Cold, Flu and Sore Throat\",V365XXD,\"Driver of three-wheeled motor vehicle injured in collision with other nonmotor vehicle in traffic accident, subsequent encounter\"\n" +
            "687,Sandoz Inc,Cefpodoxime Proxetil,M4850,\"Collapsed vertebra, not elsewhere classified, site unspecified\"\n" +
            "688,Lake Erie Medical DBA Quality Care Products LLC,Lyrica,M8700,Idiopathic aseptic necrosis of unspecified bone\n" +
            "689,Natural Health Supply,NAUSEA,V9003XD,\"Drowning and submersion due to other powered watercraft overturning, subsequent encounter\"\n" +
            "690,Cantrell Drug Company,Hydromorphone HCl,O3082,Other specified multiple gestation with two or more monoamniotic fetuses\n" +
            "691,A-S Medication Solutions LLC,Hydroxyzine Hydrochloride,M1A052,\"Idiopathic chronic gout, left hip\"\n" +
            "692,WAL-MART STORES INC.,EQUATE,S32020S,\"Wedge compression fracture of second lumbar vertebra, sequela\"\n" +
            "693,\"Global Pharmaceuticals, Division of Impax Laboratories Inc.\",Minocycline Hydrochloride,S63281A,\"Dislocation of proximal interphalangeal joint of left index finger, initial encounter\"\n" +
            "694,L Perrigo Company,Good Sense ibuprofen,S37899D,\"Unspecified injury of other urinary and pelvic organ, subsequent encounter\"\n" +
            "695,Zep Inc.,Zep Professional Mild Antimicrobial Hand Cleaner,S12391S,\"Other nondisplaced fracture of fourth cervical vertebra, sequela\"\n" +
            "696,REMEDYREPACK INC.,Isoniazid,V612XXA,\"Person on outside of heavy transport vehicle injured in collision with pedal cycle in nontraffic accident, initial encounter\"\n" +
            "697,TYA Pharmaceuticals,Lorazepam,M3301,Juvenile dermatopolymyositis with respiratory involvement\n" +
            "698,Contract Pharmacy Services-PA,Alprazolam,Y289XXA,\"Contact with unspecified sharp object, undetermined intent, initial encounter\"\n" +
            "699,Par Pharmaceutical Inc.,Fentanyl,R936,Abnormal findings on diagnostic imaging of limbs\n" +
            "700,Cardinal Health,IBU,S93141,Subluxation of metatarsophalangeal joint of right great toe\n" +
            "701,\"NATURE REPUBLIC CO., LTD.\",PROVENCE MELTING FOUNDATION,S82863N,\"Displaced Maisonneuve's fracture of unspecified leg, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with nonunion\"\n" +
            "702,\"Hospira, Inc.\",Sodium Chloride,T373X3,\"Poisoning by other antiprotozoal drugs, assault\"\n" +
            "703,Kroger Company,moisturizing lubricant,I259,\"Chronic ischemic heart disease, unspecified\"\n" +
            "704,Army & Air Force Exchange Service,exchange select acid reducer,T461X5A,\"Adverse effect of calcium-channel blockers, initial encounter\"\n" +
            "705,Parfums Christian Dior,CD DiorSkin Forever Compact Flawless Perfection Fusion Wear Makeup SPF 25 - 040,O6020X1,\"Term delivery with preterm labor, unspecified trimester, fetus 1\"\n" +
            "706,\"Supervalu, Inc\",Anticavity Fluoride Rinse,S8255XN,\"Nondisplaced fracture of medial malleolus of left tibia, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with nonunion\"\n" +
            "707,Camber Pharmaceuticals Inc.,LISINOPRIL,M21969,Unspecified acquired deformity of unspecified lower leg\n" +
            "708,\"Nelco Laboratories, Inc.\",Short Ragweed Pollen,S85181D,\"Other specified injury of posterior tibial artery, right leg, subsequent encounter\"\n" +
            "709,Safeway,antacid plus gas relief,S06387S,\"Contusion, laceration, and hemorrhage of brainstem with loss of consciousness of any duration with death due to brain injury prior to regaining consciousness, sequela\"\n" +
            "710,\"Sun & Skin Care Research, LLC\",NO-AD SPF 8 Tanning,S55899,\"Other specified injury of other blood vessels at forearm level, unspecified arm\"\n" +
            "711,\"Taro Pharmaceuticals U.S.A., Inc.\",Clotrimazole,S59101G,\"Unspecified physeal fracture of upper end of radius, right arm, subsequent encounter for fracture with delayed healing\"\n" +
            "712,\"Nelco Laboratories, Inc.\",Eucalyptus,S01309A,\"Unspecified open wound of unspecified ear, initial encounter\"\n" +
            "713,REMEDYREPACK INC.,Amlodipine Besylate,M9959,Intervertebral disc stenosis of neural canal of abdomen and other regions\n" +
            "714,\"PD-Rx Pharmaceuticals, Inc.\",Bupropion hydrochloride4b17de,H3501,Changes in retinal vascular appearance\n" +
            "715,Aidarex Pharmaceuticals LLC,AZITHROMYCIN,Y37231,\"Military operations involving explosion of improvised explosive device [IED], civilian\"\n" +
            "716,\"IVAX Pharmaceuticals, Inc.\",Lisinopril,Q97,\"Other sex chromosome abnormalities, female phenotype, not elsewhere classified\"\n" +
            "717,\"Johnson & Johnson Healthcare Products, Division of McNEIL-PPC, Inc.\",LISTERINE TOTAL CARE,H47333,\"Pseudopapilledema of optic disc, bilateral\"\n" +
            "718,\"Ascend Laboratories, LLC\",temazepam,O3103X2,\"Papyraceous fetus, third trimester, fetus 2\"\n" +
            "719,Physicians Formula Inc,Healthy Wear Pressed Bronzer,S43111,Subluxation of right acromioclavicular joint\n" +
            "720,Moore Medical LLC,Hand Sanitizer,T85613D,\"Breakdown (mechanical) of artificial skin graft and decellularized allodermis, subsequent encounter\"\n" +
            "721,Jubilant HollisterStier LLC,\"Pollens - Weeds, Kochia scoparia\",M26,Dentofacial anomalies [including malocclusion]\n" +
            "722,\"McNeil Consumer Healthcare Div McNeil-PPC, Inc\",Benadryl Allergy Liqui-Gels,T23252A,\"Burn of second degree of left palm, initial encounter\"\n" +
            "723,Mylan Pharmaceuticals Inc.,Fluoxetine,T453X4D,\"Poisoning by enzymes, undetermined, subsequent encounter\"\n" +
            "724,\"ABCO Laboratories, Inc.\",Immune Support System,K1329,\"Other disturbances of oral epithelium, including tongue\"\n" +
            "725,ARMY AND AIR FORCE EXCHANGE SERVICE,Sinus Congestion and Pain,O6982X0,\"Labor and delivery complicated by other cord entanglement, without compression, not applicable or unspecified\"\n" +
            "726,Merck Sharp & Dohme Corp.,TEMODAR,S62654S,\"Nondisplaced fracture of medial phalanx of right ring finger, sequela\"\n" +
            "727,Publix Super Markets Inc,Publix Burn Relief,Y288XXS,\"Contact with other sharp object, undetermined intent, sequela\"\n" +
            "728,AMERICAN SALES COMPANY,CARE ONE,T394X3A,\"Poisoning by antirheumatics, not elsewhere classified, assault, initial encounter\"\n" +
            "729,Bryant Ranch Prepack,Prednisone,M25311,\"Other instability, right shoulder\"\n" +
            "730,Kroger Co,Antibacterial Hand,V537XXD,\"Person on outside of pick-up truck or van injured in collision with car, pick-up truck or van in traffic accident, subsequent encounter\"\n" +
            "731,\"Physicians Total Care, Inc.\",Benicar,O6641,Failed attempted vaginal birth after previous cesarean delivery\n" +
            "732,Virtus Pharmaceuticals,NATALVIRT 90DHA,S144,Injury of peripheral nerves of neck\n" +
            "733,TARGET CORPORATION,UP and UP,V4323,Person on outside of car injured in collision with pick-up truck in nontraffic accident\n" +
            "734,\"Physicians Total Care, Inc.\",Viagra,Q201,Double outlet right ventricle\n" +
            "735,\"NCS HealthCare of KY, Inc dba Vangard Labs\",Midodrine Hydrochloride,S42145A,\"Nondisplaced fracture of glenoid cavity of scapula, left shoulder, initial encounter for closed fracture\"\n" +
            "736,Teva Pharmaceuticals USA Inc,Fentanyl,S82046R,\"Nondisplaced comminuted fracture of unspecified patella, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with malunion\"\n" +
            "737,\"Hospira, Inc.\",Ketorolac Tromethamine,S52692,Other fracture of lower end of left ulna\n" +
            "738,REMEDYREPACK INC.,Hydroxyzine Hydrochloride,Z7382,Dual sensory impairment\n" +
            "739,Mylan Pharmaceuticals Inc.,Lisinopril and Hydrochlorothiazide,S0240BG,\"Malar fracture, left side, subsequent encounter for fracture with delayed healing\"\n" +
            "740,\"KVK-TECH, Inc.\",Cyclobenzaprine Hydrochloride,S72462E,\"Displaced supracondylar fracture with intracondylar extension of lower end of left femur, subsequent encounter for open fracture type I or II with routine healing\"\n" +
            "741,\"Genentech, Inc.\",ACTEMRA,S36438A,\"Laceration of other part of small intestine, initial encounter\"\n" +
            "742,Syntrion GmbH,SyImmune,V660XXD,\"Driver of heavy transport vehicle injured in collision with other nonmotor vehicle in nontraffic accident, subsequent encounter\"\n" +
            "743,\"Papermates, Inc. dba Noteworthy\",Peppermint Hand Sanitizer,S1087,Other superficial bite of other specified part of neck\n" +
            "744,\"Troy Manufacturing, Inc.\",STOPAIN COLD PAIN RELIEVING,S62368G,\"Nondisplaced fracture of neck of other metacarpal bone, subsequent encounter for fracture with delayed healing\"\n" +
            "745,\"Talmocom Co., Ltd\",TS (Talmostop),C799,Secondary malignant neoplasm of unspecified site\n" +
            "746,\"Avon Products, Inc.\",Advance Techniques Keep Clear,S8264XJ,\"Nondisplaced fracture of lateral malleolus of right fibula, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with delayed healing\"\n" +
            "747,\"Nelco Laboratories, Inc.\",Brazil Nut,W2181,Striking against or struck by football helmet\n" +
            "748,\"Whisk Products, Inc.\",WhiskCare 387,M611,Myositis ossificans progressiva\n" +
            "749,Washington Homeopathic Products,Phytolacca Kit Refill,T189XXA,\"Foreign body of alimentary tract, part unspecified, initial encounter\"\n" +
            "750,Zydus Pharmaceuticals (USA) Inc.,Haloperidol,Y92828,Other wilderness area as the place of occurrence of the external cause\n" +
            "751,\"JHP Pharmaceuticals, LLC\",dantrolene sodium,S82441F,\"Displaced spiral fracture of shaft of right fibula, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with routine healing\"\n" +
            "752,\"Nelco Laboratories, Inc.\",Epicoccum nigrum,W908,Exposure to other nonionizing radiation\n" +
            "753,International Beauty Exchange,DERMACLAIR SKIN LIGHTENING,Y37500A,\"Military operations involving unspecified effect of nuclear weapon, military personnel, initial encounter\"\n" +
            "754,JAFRA COSMETICS INTERNATIONAL,CONTROL DYNAMICS MATTIFYING,S62134D,\"Nondisplaced fracture of capitate [os magnum] bone, right wrist, subsequent encounter for fracture with routine healing\"\n" +
            "755,\"Vertical Pharmaceuticals, Inc\",ZyPram,O1414,Severe pre-eclampsia complicating childbirth\n" +
            "756,\"Denison Pharmaceuticals, Inc.\",Decolorized Iodine,H02714,Chloasma of left upper eyelid and periocular area\n" +
            "757,\"Ionx Holdings d/b/a HelloLife, Inc.\",Candidol,S66395A,\"Other injury of extensor muscle, fascia and tendon of left ring finger at wrist and hand level, initial encounter\"\n" +
            "758,\"Lupin Pharmaceuticals, Inc.\",Fenofibrate,C211,Malignant neoplasm of anal canal\n" +
            "759,\"Fresenius Kabi USA, LLC\",Diprivan,F121,Cannabis abuse\n" +
            "760,\"Amphastar Pharmaceuticals, Inc.\",Lidocaine Hydrochloride,S52043A,\"Displaced fracture of coronoid process of unspecified ulna, initial encounter for closed fracture\"\n" +
            "761,Sandoz Inc,Azelastine Hydrochloride,Q771,Thanatophoric short stature\n" +
            "762,Target Corporation,Up and Up Bacitracin,T23072A,\"Burn of unspecified degree of left wrist, initial encounter\"\n" +
            "763,\"Physicians Total Care, Inc.\",CRESTOR,L02222,\"Furuncle of back [any part, except buttock]\"\n" +
            "764,Carilion Materials Management,Sulindac,Z121,Encounter for screening for malignant neoplasm of intestinal tract\n" +
            "765,\"BioActive Nutritional, Inc.\",FNG,Y35412A,\"Legal intervention involving bayonet, bystander injured, initial encounter\"\n" +
            "766,Shield Line LLC,Medpride,S42491S,\"Other displaced fracture of lower end of right humerus, sequela\"\n" +
            "767,Colgate-Palmolive,Colgate Sparkling White CinnaMint Fluoride,S52281,Bent bone of right ulna\n" +
            "768,Welding & Therapy Service Inc.,Oxygen,S96892D,\"Other specified injury of other specified muscles and tendons at ankle and foot level, left foot, subsequent encounter\"\n" +
            "769,Mylan Institutional Inc.,Loxapine,V9380,Other injury due to other accident on board merchant ship\n" +
            "770,\"Antigen Laboratories, Inc.\",Red Cedar,M02149,\"Postdysenteric arthropathy, unspecified hand\"\n" +
            "771,\"Integrative Healing Institute, LLC\",Seasonal Allergy Pet Formula,S60859S,\"Superficial foreign body of unspecified wrist, sequela\"\n" +
            "772,CLOETTA ITALIA S.r.l.,Bentasil,S79139G,\"Salter-Harris Type III physeal fracture of lower end of unspecified femur, subsequent encounter for fracture with delayed healing\"\n" +
            "773,Rubbermaid Commercial Products LLC,TC EnrichedFoam,F19222,Other psychoactive substance dependence with intoxication with perceptual disturbance\n" +
            "774,Sandoz Inc.,Metronidazole,V671XXD,\"Passenger in heavy transport vehicle injured in collision with fixed or stationary object in nontraffic accident, subsequent encounter\"\n" +
            "775,Major Pharmaceuticals,Carbidopa and Levodopa,S96112,\"Strain of muscle and tendon of long extensor muscle of toe at ankle and foot level, left foot\"\n" +
            "776,\"SEYER PHARMATEC, INC.\",Broncotron,T43622D,\"Poisoning by amphetamines, intentional self-harm, subsequent encounter\"\n" +
            "777,Unit Dose Services,Lyrica,V319XXA,\"Unspecified occupant of three-wheeled motor vehicle injured in collision with pedal cycle in traffic accident, initial encounter\"\n" +
            "778,\"Freshorize, Ltd.\",Trailways,T495X4,\"Poisoning by ophthalmological drugs and preparations, undetermined\"\n" +
            "779,Heritage Pharmaceuticals Inc.,Nifedipine,V9629,Other glider (nonpowered) accident injuring occupant\n" +
            "780,Rebel Distributors Corp.,Ciclopirox,T24602A,\"Corrosion of second degree of unspecified site of left lower limb, except ankle and foot, initial encounter\"\n" +
            "781,\"Centurion Labs, LLC\",EXPECTUSS,M84452A,\"Pathological fracture, left femur, initial encounter for fracture\"\n" +
            "782,\"Golden State Medical Supply, Inc.\",Guanfacine,S82156E,\"Nondisplaced fracture of unspecified tibial tuberosity, subsequent encounter for open fracture type I or II with routine healing\"\n" +
            "783,\"Blenheim Pharmacal, Inc.\",Methocarbamol,P108,Other intracranial lacerations and hemorrhages due to birth injury\n" +
            "784,\"Aqua Pharmaceuticals, LLC\",Monodox,T33012,Superficial frostbite of left ear\n" +
            "785,REMEDYREPACK INC.,Isosorbide Dinitrate,S6036,Insect bite (nonvenomous) of thumb\n" +
            "786,Aidarex Pharmaceuticals LLC,Bacitracin Zinc,S36521,Contusion of transverse colon\n" +
            "787,Greenstone LLC,Colestipol Hydrochloride,S62626K,\"Displaced fracture of medial phalanx of right little finger, subsequent encounter for fracture with nonunion\"\n" +
            "788,Safeway,Allergy Relief,S53006S,\"Unspecified dislocation of unspecified radial head, sequela\"\n" +
            "789,\"Prime Enterprises, Inc.\",Australian Gold,S2411,Complete lesion of thoracic spinal cord\n" +
            "790,\"Physicians Total Care, Inc.\",Hydromorphone Hydrochloride,H4040X2,\"Glaucoma secondary to eye inflammation, unspecified eye, moderate stage\"\n" +
            "791,\"Donovan Industries, Inc\",DawnMist Deodorant Bar No. 1/2,T653X2A,\"Toxic effect of nitroderivatives and aminoderivatives of benzene and its homologues, intentional self-harm, initial encounter\"\n" +
            "792,REMEDYREPACK INC.,Loperamide Hydrochloride,S65092A,\"Other specified injury of ulnar artery at wrist and hand level of left arm, initial encounter\"\n" +
            "793,Unit Dose Services,Cymbalta,V9181XD,\"Other injury due to other accident to passenger ship, subsequent encounter\"\n" +
            "794,Good Neighbor Pharmacy,Tussin Cough Long Acting,H35143,\"Retinopathy of prematurity, stage 3, bilateral\"\n" +
            "795,Washington Homeopathic Products,WHP Be gone Dry Eyes,T23111A,\"Burn of first degree of right thumb (nail), initial encounter\"\n" +
            "796,Rite Aid Corporation,Rite Aid Instant Hand Sanitizer,S14115A,\"Complete lesion at C5 level of cervical spinal cord, initial encounter\"\n" +
            "797,Anaconda Oxygen Service,Oxygen,V9384,Other injury due to other accident on board sailboat\n" +
            "798,CVS Pharmacy,PAIN RELIEF PM,M8085,\"Other osteoporosis with current pathological fracture, femur\"\n" +
            "799,\"Nelco Laboratories, Inc.\",Mugwort,S36419S,\"Primary blast injury of unspecified part of small intestine, sequela\"\n" +
            "800,REMEDYREPACK INC.,Terazosin Hydrochloride,M7732,\"Calcaneal spur, left foot\"\n" +
            "801,State of Florida DOH Central Pharmacy,Stavudine,K821,Hydrops of gallbladder\n" +
            "802,AMWAY CORP.,Peter Island Kids Sunscreen,V9225,Drowning and submersion due to being washed overboard from canoe or kayak\n" +
            "803,Cardinal Health,Hydralazine Hydrochloride,K137,Other and unspecified lesions of oral mucosa\n" +
            "804,\"Antigen Laboratories, Inc.\",Geotrichum candidum,T360X6,Underdosing of penicillins\n" +
            "805,\"Safecor Health, LLC\",Docusate Plus Senna,V296,Unspecified motorcycle rider injured in collision with other and unspecified motor vehicles in traffic accident\n" +
            "806,REMEDYREPACK INC.,Extended Phenytoin Sodium,Y361,War operations involving destruction of aircraft\n" +
            "807,State of Florida DOH Central Pharmacy,Ibuprofen,T2651XA,\"Corrosion of right eyelid and periocular area, initial encounter\"\n" +
            "808,Novadaq Technologies Inc.,Indocyanine green,S72136N,\"Nondisplaced apophyseal fracture of unspecified femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with nonunion\"\n" +
            "809,\"PD-Rx Pharmaceuticals, Inc.\",Triamterene and Hydrochlorothiazide,S40879D,\"Other superficial bite of unspecified upper arm, subsequent encounter\"\n" +
            "810,\"APP Pharmaceuticals, LLC\",Calcium Gluconate,Z1581,Genetic susceptibility to multiple endocrine neoplasia [MEN]\n" +
            "811,Roerig,Diflucan,N42,Other and unspecified disorders of prostate\n" +
            "812,Lake Erie Medical & Surgical Supply DBA Quality Care Products LLC,Fentanyl,M24521,\"Contracture, right elbow\"\n" +
            "813,Concordia Pharmaceuticals Inc.,Kapvay,S93105D,\"Unspecified dislocation of left toe(s), subsequent encounter\"\n" +
            "814,\"NCS HealthCare of KY, Inc dba Vangard Labs\",Venlafaxine,M856,Other cyst of bone\n" +
            "815,REMEDYREPACK INC.,Ciprofloxacin Hydrochloride,F63,Impulse disorders\n" +
            "816,Teva Pharmaceuticals USA Inc,Fluoxetine,X373XXD,\"Dust storm, subsequent encounter\"\n" +
            "817,Apotex Corp,PAROXETINE HYDROCHLORIDE,M84542G,\"Pathological fracture in neoplastic disease, left hand, subsequent encounter for fracture with delayed healing\"\n" +
            "818,McKesson Packaging Services Business Unit of McKesson Corporation,Acetaminophen,O34593,\"Maternal care for other abnormalities of gravid uterus, third trimester\"\n" +
            "819,A-S Medication Solutions LLC,Myambutol,S98119S,\"Complete traumatic amputation of unspecified great toe, sequela\"\n" +
            "820,SUPERVALU INC.,Chewable Adult Low Dose Aspirin,T65223A,\"Toxic effect of tobacco cigarettes, assault, initial encounter\"\n" +
            "821,Cardinal Health,Theophylline,S82843M,\"Displaced bimalleolar fracture of unspecified lower leg, subsequent encounter for open fracture type I or II with nonunion\"\n" +
            "822,EXPRO3 LLC,BabySpa,S68711A,\"Complete traumatic transmetacarpal amputation of right hand, initial encounter\"\n" +
            "823,McKesson,Sunmark Iodine,H15832,\"Staphyloma posticum, left eye\"\n" +
            "824,Mirror Pharmaceuticals LLC,Phentermine Hydrochloride,S76112D,\"Strain of left quadriceps muscle, fascia and tendon, subsequent encounter\"\n" +
            "825,REMEDYREPACK INC.,Ceftriaxone Sodium,T39395,Adverse effect of other nonsteroidal anti-inflammatory drugs [NSAID]\n" +
            "826,Apotheca Company,Nux Vomica,S52044H,\"Nondisplaced fracture of coronoid process of right ulna, subsequent encounter for open fracture type I or II with delayed healing\"\n" +
            "827,ESTEE LAUDER INC,DOUBLE WEAR ALL DAY GLOW BB MOISTURE MAKEUP BROAD SPECTRUM SPF 30,S72453C,\"Displaced supracondylar fracture without intracondylar extension of lower end of unspecified femur, initial encounter for open fracture type IIIA, IIIB, or IIIC\"\n" +
            "828,\"Dolgencorp, LLC\",dg health miconazole,S63613D,\"Unspecified sprain of left middle finger, subsequent encounter\"\n" +
            "829,\"SJ Creations, Inc.\",Papaya Mango Antibacterial Hand,O904,Postpartum acute kidney failure\n" +
            "830,\"Nexgen Pharma, Inc.\",Polyethylene Glycol 3350,V9102XA,\"Burn due to fishing boat on fire, initial encounter\"\n" +
            "831,\"CorePharma, LLC\",DEXTROAMPHETAMINE SULFATE,S92031A,\"Displaced avulsion fracture of tuberosity of right calcaneus, initial encounter for closed fracture\"\n" +
            "832,\"Amneal Pharmaceuticals, LLC\",Spironolactone,W11XXXS,\"Fall on and from ladder, sequela\"\n" +
            "833,HHS/Program Support Center/Supply Service Center,Ondansetron,T17810S,\"Gastric contents in other parts of respiratory tract causing asphyxiation, sequela\"\n" +
            "834,\"NATURE REPUBLIC CO., LTD.\",POLYNESIA LAGOON WATER HYDRO EYE,T2300,\"Burn of unspecified degree of hand, unspecified site\"\n" +
            "835,Apotex Corp,Quinapril Hydrochloride and Hydrochlorothiazide,S6000,Contusion of unspecified finger without damage to nail\n" +
            "836,\"Stila Styles, LLC\",stila CC color correcting broad-spectrum SPF 20 04 MEDIUM,M25372,\"Other instability, left ankle\"\n" +
            "837,Proficient Rx LP,Ipratropium Bromide,S61215A,\"Laceration without foreign body of left ring finger without damage to nail, initial encounter\"\n" +
            "838,\"Liddell Laboratories, Inc.\",Calcium Plus,S6052,Blister (nonthermal) of hand\n" +
            "839,\"Allergan, Inc.\",BOTOX,V452XXS,\"Person on outside of car injured in collision with railway train or railway vehicle in nontraffic accident, sequela\"\n" +
            "840,Efficient Laboratories Inc,Hongo Killer,S63021S,\"Subluxation of radiocarpal joint of right wrist, sequela\"\n" +
            "841,\"Matrixx Initiatives, Inc.\",Zicam Naturals Cough Suppressant,S55899D,\"Other specified injury of other blood vessels at forearm level, unspecified arm, subsequent encounter\"\n" +
            "842,Ventura Corporation LTD,LBEL divine lip gloss SPF 15,T2171XA,\"Corrosion of third degree of chest wall, initial encounter\"\n" +
            "843,Dr. Dream Inc,Dr. Dream Hydramemory Deep Cleansing,S62635P,\"Displaced fracture of distal phalanx of left ring finger, subsequent encounter for fracture with malunion\"\n" +
            "844,\"Janssen Pharmaceuticals, Inc.\",RISPERDAL M-TAB,T85199,Other mechanical complication of other implanted electronic stimulator of nervous system\n" +
            "845,\"Nelco Laboratories, Inc.\",West Wheat Grass,E1139,Type 2 diabetes mellitus with other diabetic ophthalmic complication\n" +
            "846,AMOREPACIFIC,LANEIGE SNOW CRYSTAL,D599,\"Acquired hemolytic anemia, unspecified\"\n" +
            "847,American Sales Company,Care One Medicated Lip Balm,F14951,\"Cocaine use, unspecified with cocaine-induced psychotic disorder with hallucinations\"\n" +
            "848,\"Amphastar Pharmaceuticals, Inc.\",Enoxaparin Sodium,Z87410,Personal history of cervical dysplasia\n" +
            "849,Lake Erie Medical DBA Quality Care Products LLC,Methylprednisolone,T391X3S,\"Poisoning by 4-Aminophenol derivatives, assault, sequela\"\n" +
            "850,REMEDYREPACK INC.,Venlafaxine Hydrochloride,S99011,Salter-Harris Type I physeal fracture of right calcaneus\n" +
            "851,Cardinal Health,Haloperidol,V2960XA,\"Unspecified motorcycle rider injured in collision with unspecified motor vehicles in traffic accident, initial encounter\"\n" +
            "852,\"Dispensing Solutions, Inc.\",Buspirone HCl,R402324,\"Coma scale, best motor response, extension, 24 hours or more after hospital admission\"\n" +
            "853,Major Pharmaceuticals,Ranitidine,T22621S,\"Corrosion of second degree of right elbow, sequela\"\n" +
            "854,Rugby Laboratories,Peptic Relief,C8463,\"Anaplastic large cell lymphoma, ALK-positive, intra-abdominal lymph nodes\"\n" +
            "855,Qualitest Pharmaceuticals,Zolpidem Tartrate,T84013S,\"Broken internal left knee prosthesis, sequela\"\n" +
            "856,Perrigo New York Inc,fenofibrate,T44903S,\"Poisoning by unspecified drugs primarily affecting the autonomic nervous system, assault, sequela\"\n" +
            "857,\"H.J. Harkins Company, Inc.\",Cefuroxime axetil,S42122B,\"Displaced fracture of acromial process, left shoulder, initial encounter for open fracture\"\n" +
            "858,Gambro Renal Products,PrismaSol,S52379K,\"Galeazzi's fracture of unspecified radius, subsequent encounter for closed fracture with nonunion\"\n" +
            "859,HyVee Inc,pain relief,S92255G,\"Nondisplaced fracture of navicular [scaphoid] of left foot, subsequent encounter for fracture with delayed healing\"\n" +
            "860,Sun Pharma Global FZE,ESZOPICLONE,T387X4A,\"Poisoning by androgens and anabolic congeners, undetermined, initial encounter\"\n" +
            "861,\"WOONSOCKET PRESCRIPTION CENTER,INCORPORATED\",Cough and Cold,V9113XD,\"Crushed between other powered watercraft and other watercraft or other object due to collision, subsequent encounter\"\n" +
            "862,Jubilant HollisterStier LLC,Molds - Mold Mix 10,C8174,\"Other Hodgkin lymphoma, lymph nodes of axilla and upper limb\"\n" +
            "863,\"Hahnemann Laboratories, Inc. dba Alpine Pharmaceuticals\",HAHNEMANN FEVER,S65591,Other specified injury of blood vessel of left index finger\n" +
            "864,Unit Dose Services,ENALAPRIL MALEATE,S50851S,\"Superficial foreign body of right forearm, sequela\"\n" +
            "865,AMOREPACIFIC,MAMONDE BRIGHTENING PACT 10HR N21,C9012,Plasma cell leukemia in relapse\n" +
            "866,ORGANIC & SUSTAINABLE BEAUTY,SUPER SENSITIVE DIAPER RASH,S14102,Unspecified injury at C2 level of cervical spinal cord\n" +
            "867,\"MedVantx, Inc.\",Carvedilol,W052XXS,\"Fall from non-moving motorized mobility scooter, sequela\"\n" +
            "868,Select Brand,Mineral Oil,S82001C,\"Unspecified fracture of right patella, initial encounter for open fracture type IIIA, IIIB, or IIIC\"\n" +
            "869,McKesson,health mart nicotine,S358X,\"Injury of other blood vessels at abdomen, lower back and pelvis level\"\n" +
            "870,sanofi-aventis U.S. LLC,Lovenox,S20371D,\"Other superficial bite of right front wall of thorax, subsequent encounter\"\n" +
            "871,\"Novartis Consumer Health, Inc.\",LAMISL AF,S46392S,\"Other injury of muscle, fascia and tendon of triceps, left arm, sequela\"\n" +
            "872,Forces of Nature,Nerve Pain,S41031D,\"Puncture wound without foreign body of right shoulder, subsequent encounter\"\n" +
            "873,Clinical Solutions Wholesale,Fluphenazine Hydrochloride,S20221D,\"Contusion of right back wall of thorax, subsequent encounter\"\n" +
            "874,\"Owen Biosciences, Inc.\",Naturally Nova Scotia Hand Sanitizer,T82848D,\"Pain due to vascular prosthetic devices, implants and grafts, subsequent encounter\"\n" +
            "875,Sandoz Inc,Ceftazidime,V657XXD,\"Person on outside of heavy transport vehicle injured in collision with railway train or railway vehicle in traffic accident, subsequent encounter\"\n" +
            "876,Oral BioTech,CTx4 Gel 1100,Z6830,\"Body mass index (BMI) 30.0-30.9, adult\"\n" +
            "877,\"Lifetech Resources, LLC\",Desert Bambu,S11013D,\"Puncture wound without foreign body of larynx, subsequent encounter\"\n" +
            "878,\"Gil Manufacturing, Inc.\",Foam Aid,S68120D,\"Partial traumatic metacarpophalangeal amputation of right index finger, subsequent encounter\"\n" +
            "879,REMEDYREPACK INC.,PROAIRHFA,S62394K,\"Other fracture of fourth metacarpal bone, right hand, subsequent encounter for fracture with nonunion\"\n" +
            "880,\"Antigen Laboratories, Inc.\",Dock/Sorrel Mixture,W16522,Jumping or diving into swimming pool striking bottom causing other injury\n" +
            "881,\"LG Household and Healthcare, Inc.\",GONGJINHYANG SEOL WHITENING,H66006,\"Acute suppurative otitis media without spontaneous rupture of ear drum, recurrent, bilateral\"\n" +
            "882,Wockhardt USA LLC.,Metoprolol Succinate,T63013D,\"Toxic effect of rattlesnake venom, assault, subsequent encounter\"\n" +
            "883,NorthStar RxLLC,venlafaxine,O98813,\"Other maternal infectious and parasitic diseases complicating pregnancy, third trimester\"\n" +
            "884,SUPERVALU INC.,Allergy Relief,S92591P,\"Other fracture of right lesser toe(s), subsequent encounter for fracture with malunion\"\n" +
            "885,\"Antigen Laboratories, Inc.\",Treatment Set TS345463,S52272,Monteggia's fracture of left ulna\n" +
            "886,\"BioActive Nutritional, Inc.\",Sinuforce,S72443M,\"Displaced fracture of lower epiphysis (separation) of unspecified femur, subsequent encounter for open fracture type I or II with nonunion\"\n" +
            "887,KAISER FOUNDATION HOSPITALS,TEMAZEPAM,S61323,Laceration with foreign body of left middle finger with damage to nail\n" +
            "888,Bryant Ranch Prepack,Diphenhydramine Hydrochloride,S2600XS,\"Unspecified injury of heart with hemopericardium, sequela\"\n" +
            "889,\"Deseret Biologicals, Inc.\",Bio Viscum Compositum,S3103,Puncture wound without foreign body of lower back and pelvis\n" +
            "890,Mylan Pharmaceuticals Inc.,Levothyroxine Sodium,D287,Benign neoplasm of other specified female genital organs\n" +
            "891,Amerisource Bergen,GNP Calamine Topical Suspension,S82142G,\"Displaced bicondylar fracture of left tibia, subsequent encounter for closed fracture with delayed healing\"\n" +
            "892,Sandoz Inc,Bupropion Hydrochloride,H7192,\"Unspecified cholesteatoma, left ear\"\n" +
            "893,AVEDA COPORATION,MINERAL TINTED MOISTURE,M8928,\"Other disorders of bone development and growth, other site\"\n" +
            "894,Applied Biology,Photocil,Y92139,Unspecified place military base as the place of occurrence of the external cause\n" +
            "895,Qualitest Pharmaceuticals,Folic Acid,S82442G,\"Displaced spiral fracture of shaft of left fibula, subsequent encounter for closed fracture with delayed healing\"\n" +
            "896,Virtus Pharmaceuticals,VP-CH-PNV,S2221XA,\"Fracture of manubrium, initial encounter for closed fracture\"\n" +
            "897,Laboratoires Clarins S.A.,CLARINS BROAD SPECTRUM SPF 50 Plus - SUNSCREEN CARE MILK,L02425,Furuncle of right lower limb\n" +
            "898,ORGANIC & SUSTAINABLE BEAUTY,SUPER SENSITIVE DIAPER RASH,B192,Unspecified viral hepatitis C\n" +
            "899,\"Harmon Stores, Inc\",Petrolatum,G4420,\"Tension-type headache, unspecified\"\n" +
            "900,Sion Biotext Medical Ltd,PETROLATUM,O411094,\"Infection of amniotic sac and membranes, unspecified, unspecified trimester, fetus 4\"\n" +
            "901,Rebel Distributors Corp,Labetalol hydrochloride,S42309B,\"Unspecified fracture of shaft of humerus, unspecified arm, initial encounter for open fracture\"\n" +
            "902,Jubilant HollisterStier LLC,\"Pollens - Weeds and Garden Plants, Sagebrush, Mugwort Artemisia vulgaris\",I7036,Atherosclerosis of unspecified type of bypass graft(s) of the extremities with gangrene\n" +
            "903,Corepharma LLC.,Cilostazol,T60,Toxic effect of pesticides\n" +
            "904,Dolgencorp Inc,ANTI BACTERIAL HAND SANITIZER,G95,Other and unspecified diseases of spinal cord\n" +
            "905,\"Physicians Total Care, Inc.\",Dicloxacillin Sodium,S83206,\"Unspecified tear of unspecified meniscus, current injury, right knee\"\n" +
            "906,Cardinal Health,Jantoven,V9540XA,\"Unspecified spacecraft accident injuring occupant, initial encounter\"\n" +
            "907,\"Safetec of America, Inc.\",Lidocaine Hydrochloride,T85630S,\"Leakage of cranial or spinal infusion catheter, sequela\"\n" +
            "908,\"Stephen L. LaFrance Pharmacy, Inc.\",Sinus Congestion and Pain,T466X2S,\"Poisoning by antihyperlipidemic and antiarteriosclerotic drugs, intentional self-harm, sequela\"\n" +
            "909,\"MSD Consumer Care, Inc.\",Coppertone Dry,H44622,\"Retained (old) magnetic foreign body in iris or ciliary body, left eye\"\n" +
            "910,\"ALK-Abello, Inc.\",CORYLUS AMERICANA POLLEN,M8644,\"Chronic osteomyelitis with draining sinus, hand\"\n" +
            "911,Select Corporation,Sinus Relief Severe Congestion,H26221,\"Cataract secondary to ocular disorders (degenerative) (inflammatory), right eye\"\n" +
            "912,\"Antigen Laboratories, Inc.\",Mucor Mixture,S59102A,\"Unspecified physeal fracture of upper end of radius, left arm, initial encounter for closed fracture\"\n" +
            "913,Ming Fai Industrial (Shenzhen) Co. Ltd,Colgate Anticavity Kit,S52022Q,\"Displaced fracture of olecranon process without intraarticular extension of left ulna, subsequent encounter for open fracture type I or II with malunion\"\n" +
            "914,McKesson (Sunmark),Day Time PE,T507X4,\"Poisoning by analeptics and opioid receptor antagonists, undetermined\"\n" +
            "915,\"Office Max, Inc.\",Highmark Professional Antibacterial Foam Handwash,S4022,Blister (nonthermal) of shoulder\n" +
            "916,Alaven Pharmaceutical LLC,Proctofoam,V980XXD,\"Accident to, on or involving cable-car, not on rails, subsequent encounter\"\n" +
            "917,Citron Pharma LLC,Cefadroxil,S42425B,\"Nondisplaced comminuted supracondylar fracture without intercondylar fracture of left humerus, initial encounter for open fracture\"\n" +
            "918,Coty US LLC,ck one waterfresh face makeup spf 15,S40929S,\"Unspecified superficial injury of unspecified upper arm, sequela\"\n" +
            "919,Rebel Distributors Corp.,AK-Con,V347XXD,\"Person on outside of three-wheeled motor vehicle injured in collision with heavy transport vehicle or bus in traffic accident, subsequent encounter\"\n" +
            "920,Jubilant Cadista Pharmaceuticals Inc.,Risperidone,T470,\"Poisoning by, adverse effect of and underdosing of histamine H2-receptor blockers\"\n" +
            "921,Aidarex Pharmaceuticals LLC,Oxcarbazepine,S82876C,\"Nondisplaced pilon fracture of unspecified tibia, initial encounter for open fracture type IIIA, IIIB, or IIIC\"\n" +
            "922,\"Golden State Medical Supply, Inc.\",Doxazosin mesylate,M80812A,\"Other osteoporosis with current pathological fracture, left shoulder, initial encounter for fracture\"\n" +
            "923,\"GRIFOLS USA, LLC\",Gamunex-C,Y35891A,\"Legal intervention involving other specified means, law enforcement official injured, initial encounter\"\n" +
            "924,KAISER FOUNDATION HOSPITALS,Diltiazem Hydrochloride,V367XXD,\"Person on outside of three-wheeled motor vehicle injured in collision with other nonmotor vehicle in traffic accident, subsequent encounter\"\n" +
            "925,\"Mallinckrodt, Inc.\",ANAFRANIL,S32485B,\"Nondisplaced dome fracture of left acetabulum, initial encounter for open fracture\"\n" +
            "926,Parfums Christian Dior,CD CAPTURE TOTALE Multi-Perfection UVB Base Sunscreen SPF 50,S1329XA,\"Dislocation of other parts of neck, initial encounter\"\n" +
            "927,State of Florida DOH Central Pharmacy,Didanosine,T82399D,\"Other mechanical complication of unspecified vascular grafts, subsequent encounter\"\n" +
            "928,Reckitt Benckiser LLC,Delsym,S92343K,\"Displaced fracture of fourth metatarsal bone, unspecified foot, subsequent encounter for fracture with nonunion\"\n" +
            "929,Neutrogena Corporation,Neutrogena SkinClearing,S06317S,\"Contusion and laceration of right cerebrum with loss of consciousness of any duration with death due to brain injury prior to regaining consciousness, sequela\"\n" +
            "930,\"Whisk Products, Inc.\",WhiskCare 357,S064X6S,\"Epidural hemorrhage with loss of consciousness greater than 24 hours without return to pre-existing conscious level with patient surviving, sequela\"\n" +
            "931,\"ALK-Abello, Inc.\",LIGUSTRUM VULGARE POLLEN,H61319,\"Acquired stenosis of external ear canal secondary to trauma, unspecified ear\"\n" +
            "932,Merck Sharp & Dohme Corp.,Lotrisone,S66929S,\"Laceration of unspecified muscle, fascia and tendon at wrist and hand level, unspecified hand, sequela\"\n" +
            "933,\"Physicians Total Care, Inc.\",Fosinopril Sodium,S32612B,\"Displaced avulsion fracture of left ischium, initial encounter for open fracture\"\n" +
            "934,Colgate-Palmolive Company,PreviDent,T485X1,\"Poisoning by other anti-common-cold drugs, accidental (unintentional)\"\n" +
            "935,\"Professional Hospital Supply, Inc.\",Isopropyl Rubbing Alcohol,S01352A,\"Open bite of left ear, initial encounter\"\n" +
            "936,CRC (Cosmoceutical Research Center),LIGHTENER,O368923,\"Maternal care for other specified fetal problems, second trimester, fetus 3\"\n" +
            "937,\"Nelco Laboratories, Inc.\",Tobacco Leaf,T2153XD,\"Corrosion of first degree of upper back, subsequent encounter\"\n" +
            "938,\"NCS HealthCare of KY, Inc dba Vangard Labs\",Diltiazem Hydrochloride,S92222K,\"Displaced fracture of lateral cuneiform of left foot, subsequent encounter for fracture with nonunion\"\n" +
            "939,\"Aplicare, Inc.\",Aplicare Antiseptic Hand Rinse,T5494XA,\"Toxic effect of unspecified corrosive substance, undetermined, initial encounter\"\n" +
            "940,American Sales Company,Care One Nasal Four,S32434K,\"Nondisplaced fracture of anterior column [iliopubic] of right acetabulum, subsequent encounter for fracture with nonunion\"\n" +
            "941,Bryant Ranch Prepack,Senna-Lax,V134XXA,\"Pedal cycle driver injured in collision with car, pick-up truck or van in traffic accident, initial encounter\"\n" +
            "942,COSTCO WHOLESALE CORPORATION,Sleep Aid,S36501,Unspecified injury of transverse colon\n" +
            "943,\"GOJO Industries, Inc.\",PURELL Cottony Soft,M84632K,\"Pathological fracture in other disease, left ulna, subsequent encounter for fracture with nonunion\"\n" +
            "944,\"Nelco Laboratories, Inc.\",Italian Rye Grass,S45912D,\"Laceration of unspecified blood vessel at shoulder and upper arm level, left arm, subsequent encounter\"\n" +
            "945,The Dodge Company Inc.,Germasidol,Q124,Spherophakia\n" +
            "946,Baxter Healthcare Corporation,TISSEEL,F200,Paranoid schizophrenia\n" +
            "947,Cardinal Health,Zithromax,S45992A,\"Other specified injury of unspecified blood vessel at shoulder and upper arm level, left arm, initial encounter\"\n" +
            "948,\"Otsuka America Pharmaceutical, Inc.\",ABILIFY MAINTENA,S42131,\"Displaced fracture of coracoid process, right shoulder\"\n" +
            "949,Benco Dental,Mepivacaine,S3260,Unspecified fracture of ischium\n" +
            "950,\"Vectair Systems, Inc.\",Sanitex MVP Liquid Anti-Bacterial,S32465K,\"Nondisplaced associated transverse-posterior fracture of left acetabulum, subsequent encounter for fracture with nonunion\"\n" +
            "951,H E B,hydrocortisone,V9412XA,\"Bather struck by nonpowered watercraft, initial encounter\"\n" +
            "952,\"General Injectables & Vaccines, Inc\",Aminophylline,T39015,Adverse effect of aspirin\n" +
            "953,\"ALK-Abello, Inc.\",POPULUS ALBA POLLEN,M27,Other diseases of jaws\n" +
            "954,Sandoz Inc,Valsartan,T7492XA,\"Unspecified child maltreatment, confirmed, initial encounter\"\n" +
            "955,Delta Brands Inc.,Lucky,T536,Toxic effects of other halogen derivatives of aliphatic hydrocarbons\n" +
            "956,Beiersdorf Inc,Nivea A Kiss of Shine Natural Look Glossy Lip Care,M5415,\"Radiculopathy, thoracolumbar region\"\n" +
            "957,\"Liddell Laboratories, Inc.\",Poison Oak Ivy,S72492P,\"Other fracture of lower end of left femur, subsequent encounter for closed fracture with malunion\"\n" +
            "958,Feelgood Health,BaniFlu,T5491XA,\"Toxic effect of unspecified corrosive substance, accidental (unintentional), initial encounter\"\n" +
            "959,Procter & Gamble Manufacturing Co.,Head and Shoulders Conditioner,M25369,\"Other instability, unspecified knee\"\n" +
            "960,Woodbine Products Company,Derma 1 Healthcare Hand Wash,L2389,Allergic contact dermatitis due to other agents\n" +
            "961,\"ALK-Abello, Inc.\",ARTEMISIA TRIDENTATA POLLEN,T3441XS,\"Frostbite with tissue necrosis of right arm, sequela\"\n" +
            "962,\"Watson Pharma, Inc.\",NEXT CHOICE,R1011,Right upper quadrant pain\n" +
            "963,\"Sagent Pharmaceuticals, Inc.\",Ampicillin and Sulbactam,S92201S,\"Fracture of unspecified tarsal bone(s) of right foot, sequela\"\n" +
            "964,\"NCS HealthCare of KY, Inc dba Vangard Labs\",Levetiracetam,T387X6S,\"Underdosing of androgens and anabolic congeners, sequela\"\n" +
            "965,Geri-Care Pharmaceutical Corp,Stool Softener,I7045,Atherosclerosis of autologous vein bypass graft(s) of other extremity with ulceration\n" +
            "966,Mylan Pharmaceuticals Inc.,Risperidone,S59211G,\"Salter-Harris Type I physeal fracture of lower end of radius, right arm, subsequent encounter for fracture with delayed healing\"\n" +
            "967,H E B,all day pain relief,T23779S,\"Corrosion of third degree of unspecified wrist, sequela\"\n" +
            "968,Rebel Distributors Corp,Effexor,S92505A,\"Nondisplaced unspecified fracture of left lesser toe(s), initial encounter for closed fracture\"\n" +
            "969,STAT RX USA LLC,BACITRACIN ZINC AND POLYMYXIN B SULFATE,M90649,\"Osteitis deformans in neoplastic diseases, unspecified hand\"\n" +
            "970,\"SMASHBOX BEAUTY COSMETICS, INC\",PHOTO FINISH MORE THAN PRIMER BLEMISH CONTROL,S72044F,\"Nondisplaced fracture of base of neck of right femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with routine healing\"\n" +
            "971,Rebel Distributors Corp,Hydrocodone Bitartrate and Acetaminophen,M8974,\"Major osseous defect, hand\"\n" +
            "972,Accord Healthcare Inc,Mitomycin,S82092C,\"Other fracture of left patella, initial encounter for open fracture type IIIA, IIIB, or IIIC\"\n" +
            "973,Mylan Pharmaceuticals Inc.,Pantoprazole Sodium,G5730,\"Lesion of lateral popliteal nerve, unspecified lower limb\"\n" +
            "974,Sanum Kehlbeck GmbH & Co. KG,Pleo Mucedo,S63264,Dislocation of metacarpophalangeal joint of right ring finger\n" +
            "975,Wockhardt USA LLC.,Midazolam hydrochloride,S52346P,\"Nondisplaced spiral fracture of shaft of radius, unspecified arm, subsequent encounter for closed fracture with malunion\"\n" +
            "976,GlaxoSmithKline Consumer Heathcare LP,TUMS,W3410,Accidental malfunction from unspecified firearms or gun\n" +
            "977,\"Teh Seng Pharmaceutical Mfg. Co., Ltd.\",Absorbine BACK Therapeutic Pain Relief,S81819,\"Laceration without foreign body, unspecified lower leg\"\n" +
            "978,REMEDYREPACK INC.,Hydralazine Hydrochloride,M87379,\"Other secondary osteonecrosis, unspecified toe(s)\"\n" +
            "979,King Bio Inc.,Hangover Relief,S63219S,\"Subluxation of metacarpophalangeal joint of unspecified finger, sequela\"\n" +
            "980,Mylan Institutional Inc.,Chlordiazepoxide Hydrochloride,T593X,Toxic effect of lacrimogenic gas\n" +
            "981,Kmart Corporation,smart sense allergy relief,C9190,\"Lymphoid leukemia, unspecified not having achieved remission\"\n" +
            "982,Topco Associates LLC,TopCare Sinus and Allergy PE,S4226,Fracture of lesser tuberosity of humerus\n" +
            "983,Aurobindo Pharma Limited,Cefprozil,S52034M,\"Nondisplaced fracture of olecranon process with intraarticular extension of right ulna, subsequent encounter for open fracture type I or II with nonunion\"\n" +
            "984,MSC Industrial Supply,PRO-SOURCE ANTIMICROBIAL HAND CLEANING WIPES,V9015XS,\"Drowning and submersion due to canoe or kayak sinking, sequela\"\n" +
            "985,McKesson Contract Packaging,Glipizide,S52255J,\"Nondisplaced comminuted fracture of shaft of ulna, left arm, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with delayed healing\"\n" +
            "986,\"Allergy Laboratories, Inc.\",AMERICAN BEECH POLLEN,S65111,Laceration of radial artery at wrist and hand level of right arm\n" +
            "987,\"Apple Products, Inc.\",Hanitizer,T50B94S,\"Poisoning by other viral vaccines, undetermined, sequela\"\n" +
            "988,\"Shanghai Yinjing Medical Supplies Co., Ltd.\",ALCOHOL PREP PAD - MEDIUM,H04111,Dacryops of right lacrimal gland\n" +
            "989,Eli Lilly and Company,Humulin,S92223P,\"Displaced fracture of lateral cuneiform of unspecified foot, subsequent encounter for fracture with malunion\"\n" +
            "990,Uriel Pharmacy Inc.,Symphytum Stannum,M1917,\"Post-traumatic osteoarthritis, ankle and foot\"\n" +
            "991,BrandStorm HBC,Hepar Sulphuris Calcareum 30c,S72431K,\"Displaced fracture of medial condyle of right femur, subsequent encounter for closed fracture with nonunion\"\n" +
            "992,\"NCS HealthCare of KY, Inc dba Vangard Labs\",Fluoxetine Hydrochloride,S6045,Superficial foreign body of fingers\n" +
            "993,\"Humco Holding Group, Inc.\",Humco Aluminum Acetate (Burrow),T17290A,\"Other foreign object in pharynx causing asphyxiation, initial encounter\"\n" +
            "994,\"Certus Medical, Inc.\",Purgo Satin Foam,R1110,\"Vomiting, unspecified\"\n" +
            "995,Meijer,Meijer Extra Strength Cold and Hot Medicated,S11035,Open bite of vocal cord\n" +
            "996,Jafra Cosmetics International Inc,Time Dynamics,S55911,\"Laceration of unspecified blood vessel at forearm level, right arm\"\n" +
            "997,\"Wyeth Pharmaceutical Division of Wyeth Holdings Corporation, a subsidiary of Pfizer Inc.\",Prevnar,S76801A,\"Unspecified injury of other specified muscles, fascia and tendons at thigh level, right thigh, initial encounter\"\n" +
            "998,\"Preferred Pharmaceuticals, Inc\",temazepam,S72331F,\"Displaced oblique fracture of shaft of right femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with routine healing\"\n" +
            "999,\"Personal Care Products, LLC\",Advanced Whitening Anticavity Fluoride,S79102,Unspecified physeal fracture of lower end of left femur\n" +
            "1000,West-ward Pharmaceutical Corp,Amoxicillin,S99229K,\"Salter-Harris Type II physeal fracture of phalanx of unspecified toe, subsequent encounter for fracture with nonunion\"\n";

}
