import React, { useState, useEffect } from 'react';
import PuzzlePiece from '../components/PuzzlePiece';
import './PuzzlePage.css';

const gridSize = 8; // 8x8 grid
const pieceWidth = 135; // Width of each piece
const pieceHeight = 240; // Height of each piece

const PuzzlePage = () => {
  const [pieces, setPieces] = useState([]);
  const [showReference, setShowReference] = useState(false);

  useEffect(() => {
    const piecesArray = [];
    for (let i = 1; i <= gridSize * gridSize; i++) {
      const piece = {
        id: i,
        image: `${process.env.PUBLIC_URL}/puzzle-pieces/piece-${i}.jpg`,
        width: pieceWidth,
        height: pieceHeight,
      };
      piecesArray.push(piece);
    }

    // Shuffle pieces initially
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

  const solvePuzzle = () => {
    // Sort the pieces array by the piece ID in ascending order
    const solvedPieces = [...pieces].sort((a, b) => a.id - b.id);
    setPieces(solvedPieces);
  };

  return (
    <div className="puzzle-container">
      <h1>Jigsaw Puzzle</h1>
      <div className="puzzle-grid" style={{ gridTemplateColumns: `repeat(${gridSize}, ${pieceWidth}px)` }}>
        {pieces.map((piece, index) => (
          <PuzzlePiece
            key={piece.id}
            id={piece.id}
            piece={piece}
            onDropPiece={handleDropPiece}
            gridIndex={index + 1} // Displaying 1-based index
          />
        ))}
      </div>
      <button
        className="reference-button"
        onClick={toggleReference}
      >
        Show Reference
      </button>
      <button
        className="solve-button"
        onClick={solvePuzzle}
        style={{ backgroundColor: 'green' }}
      >
        Auto Solve
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
