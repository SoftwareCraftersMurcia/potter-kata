const calculatePrice = (basket = []) => {    
    return basket.length * 8;
};

module.exports = {calculatePrice};
