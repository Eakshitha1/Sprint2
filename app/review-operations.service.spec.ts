import { TestBed } from '@angular/core/testing';

import { ReviewOperationsService } from './review-operations.service';

describe('ReviewOperationsService', () => {
  let service: ReviewOperationsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ReviewOperationsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
