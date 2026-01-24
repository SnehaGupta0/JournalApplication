package E2EEApplication.journalApp.repository;

import E2EEApplication.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String>
{

}
