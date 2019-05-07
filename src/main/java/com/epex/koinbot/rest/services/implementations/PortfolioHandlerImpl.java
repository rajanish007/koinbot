package com.epex.koinbot.rest.services.implementations;

import com.epex.koinbot.entities.*;
import com.epex.koinbot.enums.Currency;
import com.epex.koinbot.repository.*;
import com.epex.koinbot.rest.services.interfaces.KoinAPIServices;
import com.epex.koinbot.rest.services.interfaces.PortfolioHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PortfolioHandlerImpl implements PortfolioHandler {

    @Autowired
    private KoinAPIServices koinAPIServices;

    @Autowired
    private EtherRepository etherRepository;

    @Autowired
    private BitcoinRepository bitcoinRepository;

    @Autowired
    private LitecoinRepository litecoinRepository;

    @Autowired
    private RippleRepository rippleRepository;

    @Autowired
    private OmisegoRepository omisegoRepository;

    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private ZeroxRepository zeroxRepository;

    @Autowired
    private GolemRepository golemRepository;

    @Autowired
    private BasicAttentionTokenRepository basicAttentionTokenRepository;

    @Autowired
    private AeternityRepository aeternityRepository;

    @Autowired
    private TronRepository tronRepository;

    @Autowired
    private StellarRepository stellarRepository;

    @Autowired
    private NucleusVisionRepository nucleusVisionRepository;

    @Autowired
    private EOSRepository eosRepository;

    @Autowired
    private OntologyRepository ontologyRepository;

    @Autowired
    private ZilliqaRepository zilliqaRepository;

    @Autowired
    private IOSTokenRepository iosTokenRepository;

    @Autowired
    private DecentraLandRepository decentraLandRepository;

    @Autowired
    private ZebiRepository zebiRepository;

    @Autowired
    private StatusRepository statusRepository;

    @Autowired
    private PolymathRepository polymathRepository;

    @Autowired
    private AelfRepository aelfRepository;

    @Autowired
    private AugurRepository augurRepository;

    @Autowired
    private QuarkChainRepository quarkChainRepository;

    @Autowired
    private BitcoinCashABCRepository bitcoinCashABCRepository;

    @Autowired
    private TrueUSDRepository trueUSDRepository;

    @Autowired
    private BitcoinCashSVRepository bitcoinCashSVRepository;

    @Autowired
    private BitTorrentRepository bitTorrentRepository;

    private Logger logger = LoggerFactory.getLogger(PortfolioHandler.class);

    @Override
    public List<CurrencyPortfolio> GeneratePortfolio(Currency currency) {
        List<CurrencyPortfolio> currencyPortfolios = koinAPIServices.getCurrencyPortfolioFor(currency);
        List<CurrencyPortfolio> updatedPortfolios = new ArrayList();
        for (CurrencyPortfolio currencyPortfolio : currencyPortfolios) {
            switch (Currency.valueOf(currencyPortfolio.getCurrency_short_form())) {
                case ETH:
                    currencyPortfolio = etherRepository.save(new Ether(currencyPortfolio));
                    logger.info("Updated Ether Portfolio !");
                    break;
                case BTC:
                    currencyPortfolio = bitcoinRepository.save(new Bitcoin(currencyPortfolio));
                    logger.info("Updated Bitcoin Portfolio !");
                    break;
                case LTC:
                    currencyPortfolio = litecoinRepository.save(new Litecoin(currencyPortfolio));
                    logger.info("Updated Litecoin Portfolio !");
                    break;
                case XRP:
                    currencyPortfolio = rippleRepository.save(new Ripple(currencyPortfolio));
                    logger.info("Updated Ripple Portfolio !");
                    break;
                case OMG:
                    currencyPortfolio = omisegoRepository.save(new Omisego(currencyPortfolio));
                    logger.info("Updated Omisego Portfolio !");
                    break;
                case REQ:
                    currencyPortfolio = requestRepository.save(new Request(currencyPortfolio));
                    logger.info("Updated Request Portfolio !");
                    break;
                case ZRX:
                    currencyPortfolio = zeroxRepository.save(new Zerox(currencyPortfolio));
                    logger.info("Updated Zerox Portfolio !");
                    break;
                case GNT:
                    currencyPortfolio = golemRepository.save(new Golem(currencyPortfolio));
                    logger.info("Updated Ether Portfolio !");
                    break;
                case BAT:
                    currencyPortfolio = basicAttentionTokenRepository.save(new BasicAttentionToken(currencyPortfolio));
                    logger.info("Updated BasicAttentionToken Portfolio !");
                    break;
                case AE:
                    currencyPortfolio = aeternityRepository.save(new Aeternity(currencyPortfolio));
                    logger.info("Updated Aeternity Portfolio !");
                    break;
                case TRX:
                    currencyPortfolio = tronRepository.save(new Tron(currencyPortfolio));
                    logger.info("Updated Tron Portfolio !");
                    break;
                case XLM:
                    currencyPortfolio = stellarRepository.save(new Stellar(currencyPortfolio));
                    logger.info("Updated Stellar Portfolio !");
                    break;
                case NCASH:
                    currencyPortfolio = nucleusVisionRepository.save(new NucleusVision(currencyPortfolio));
                    logger.info("Updated Nucleus Vision Portfolio !");
                    break;
                case EOS:
                    currencyPortfolio = eosRepository.save(new EOS(currencyPortfolio));
                    logger.info("Updated EOS Portfolio !");
                    break;
                case ONT:
                    currencyPortfolio = ontologyRepository.save(new Ontology(currencyPortfolio));
                    logger.info("Updated Ontology Portfolio !");
                    break;
                case ZIL:
                    currencyPortfolio = zilliqaRepository.save(new Zilliqa(currencyPortfolio));
                    logger.info("Updated Zilliqa Portfolio !");
                    break;
                case IOST:
                    currencyPortfolio = iosTokenRepository.save(new IOSToken(currencyPortfolio));
                    logger.info("Updated iOSToken Portfolio !");
                    break;
                case MANA:
                    currencyPortfolio = decentraLandRepository.save(new DecentraLand(currencyPortfolio));
                    logger.info("Updated DecentraLand Portfolio !");
                    break;
                case ZCO:
                    currencyPortfolio = zebiRepository.save(new Zebi(currencyPortfolio));
                    logger.info("Updated Zebi Portfolio !");
                    break;
                case SNT:
                    currencyPortfolio = statusRepository.save(new Status(currencyPortfolio));
                    logger.info("Updated Status Portfolio !");
                    break;
                case POLY:
                    currencyPortfolio = polymathRepository.save(new Polymath(currencyPortfolio));
                    logger.info("Updated Polymath Portfolio !");
                    break;
                case ELF:
                    currencyPortfolio = aelfRepository.save(new Aelf(currencyPortfolio));
                    logger.info("Updated Aelf Portfolio !");
                    break;
                case REP:
                    currencyPortfolio = augurRepository.save(new Augur(currencyPortfolio));
                    logger.info("Updated Augur Portfolio !");
                    break;
                case QKC:
                    currencyPortfolio = quarkChainRepository.save(new QuarkChain(currencyPortfolio));
                    logger.info("Updated QuarkChain Portfolio !");
                    break;
                case BCHABC:
                    currencyPortfolio = bitcoinCashABCRepository.save(new BitcoinCashABC(currencyPortfolio));
                    logger.info("Updated BitcoinCashABC Portfolio !");
                    break;
                case TUSD:
                    currencyPortfolio = trueUSDRepository.save(new TrueUSD(currencyPortfolio));
                    logger.info("Updated TrueUSD Portfolio !");
                    break;
                case BSV:
                    currencyPortfolio = bitcoinCashSVRepository.save(new BitcoinCashSV(currencyPortfolio));
                    logger.info("Updated BitcoinCashSV Portfolio !");
                    break;
                case BTT:
                    currencyPortfolio = bitTorrentRepository.save(new BitTorrent(currencyPortfolio));
                    logger.info("Updated BitTorrent Portfolio !");
                    break;
            }
            updatedPortfolios.add(currencyPortfolio);
        }
        return updatedPortfolios;
    }

}
