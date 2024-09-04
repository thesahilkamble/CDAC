import React, { useState, useEffect } from 'react';
import PuzzlePiece from '../components/PuzzlePiece';
import './PuzzlePage.css';

const gridSize = 15; // 15x15 grid
const pieceSize = 40; // Adjust this size based on your image dimensions

const PuzzlePage = () => {
  const [pieces, setPieces] = useState([]);
  const [showReference, setShowReference] = useState(false);

  useEffect(() => {
    const piecesArray = [];
    for (let i = 1; i <= 225; i++) {
      const piece = {
        id: i,
        image: `${process.env.PUBLIC_URL}/puzzle-pieces/piece-${i}.jpg`,
        width: pieceSize,
        height: pieceSize,
      };
      piecesArray.push(piece);
    }

    const shuffledPieces = [...piecesArray].sort(() => Math.random() - 0.5);
    setPieces(shuffledPieces);
  }, []);

  const handleDropPiece = (fromId, toId) => {
    const fromIndex = pieces.findIndex((piece) => piece.id === fromId);
    const toIndex = pieces.findIndex((piece) => piece.id === toId);

    const newPieces = [...pieces];
    [newPieces[fromIndex], newPieces[toIndex]] = [newPieces[toIndex], newPieces[fromIndex]];
    setPieces(newPieces);
  };

  const toggleReference = () => {
    setShowReference(!showReference);
  };

  return (
    <div className="puzzle-container">
      <h1>Jigsaw Puzzle</h1>
      <div className="puzzle-grid">
        {pieces.map((piece) => (
          <PuzzlePiece
            key={piece.id}
            id={piece.id}
            piece={piece}
            onDropPiece={handleDropPiece}
          />
        ))}
      </div>
      <button
        className="reference-button"
        onClick={toggleReference}
      >
        Show Reference
      </button>
      {showReference && (
        <div className="reference-popup">
          <img
            src={`${process.env.PUBLIC_URL}/puzzle-image.jpg`}
            alt="Reference"
            className="reference-image"
          />
        </div>
      )}
    </div>
  );
};

export default PuzzlePage;
